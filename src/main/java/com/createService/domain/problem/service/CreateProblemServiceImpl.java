package com.createService.domain.problem.service;

import com.createService.domain.common.models.Id;
import com.createService.domain.common.exceptions.InvalidInputException;
import com.createService.domain.problem.model.Problem;
import com.createService.domain.problem.model.SubmissionCount;
import com.createService.domain.problem.repositories.ProblemRepository;
import com.createService.domain.problem.repositories.SubmissionCountRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CreateProblemServiceImpl implements CreateProblemService{

    @Autowired
    private ProblemRepository problemRepository;

    @Autowired
    private SubmissionCountRepository submissionCountRepository;

    @Override
    public Id create(Input input) throws InvalidInputException {
        Problem problem = Problem.create(
                input.name,
                input.description,
                input.author,
                input.memoryLimits,
                input.timeLimits,
                input.allowedProgrammingLanguages,
                input.serviceToCreate
        );
        problemRepository.create(problem);
        SubmissionCount submissionCount = SubmissionCount.create(problem.getId(), problem.getServiceToCreate());
        submissionCountRepository.create(submissionCount);
        return problem.getId();
    }
}
