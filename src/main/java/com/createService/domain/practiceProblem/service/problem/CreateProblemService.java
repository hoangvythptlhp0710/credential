package com.createService.domain.practiceProblem.service.problem;

import com.createService.domain.common.exceptions.InvalidInputException;
import com.createService.domain.common.models.DateTime;
import com.createService.domain.common.models.Id;
import com.createService.domain.practiceProblem.config.PracticeProblemServiceName;
import com.createService.domain.practiceProblem.models.Difficulty;
import com.createService.domain.practiceProblem.models.Problem;
import com.createService.domain.practiceProblem.repositories.PracticeProblemRepository;
import com.createService.domain.problem.model.MemoryLimit;
import com.createService.domain.problem.model.ProgrammingLanguage;
import com.createService.domain.problem.model.TimeLimit;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@AllArgsConstructor
public class CreateProblemService {

    public PracticeProblemRepository practiceProblemRepository;
    @Autowired
    private final com.createService.domain.problem.service.CreateProblemService createCoreProblemService;

    @AllArgsConstructor
    @NoArgsConstructor
    public static class Input{
        public Difficulty difficulty;
        public String name;
        public String description;
        public List<MemoryLimit.CreateInputML> memoryLimits;
        public List<TimeLimit.CreateInputTL> timeLimits;
        public List<ProgrammingLanguage> allowedProgrammingLanguage;
        public Id author;


    }

    public Id create(Input input) throws InvalidInputException {
        Id coreProblemId = createCoreProblemService.create(
                new com.createService.domain.problem.service.CreateProblemService.Input(
                        input.name,
                        input.description,
                        input.author,
                        input.memoryLimits,
                        input.timeLimits,
                        input.allowedProgrammingLanguage,
                        PracticeProblemServiceName.serviceName
                )
        );
        Problem practiceProblem = Problem.createPracticeProblem(coreProblemId,input.difficulty);
        practiceProblemRepository.create(practiceProblem);
        return practiceProblem.getId();
    }
}
