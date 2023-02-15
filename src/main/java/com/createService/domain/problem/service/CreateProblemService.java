package com.createService.domain.problem.service;

import com.createService.domain.common.models.Id;
import com.createService.domain.common.exceptions.InvalidInputException;
import com.createService.domain.problem.model.MemoryLimit;
import com.createService.domain.problem.model.ProgrammingLanguage;
import com.createService.domain.problem.model.TimeLimit;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

public interface CreateProblemService {

    Id create(com.createService.domain.practiceProblem.service.problem.CreateProblemService.Input input);

    @AllArgsConstructor
    @NoArgsConstructor
    public static class Input{
        public String name;
        public String description;
        public Id author;
        public List<MemoryLimit.CreateInputML> memoryLimits;
        public List<TimeLimit.CreateInputTL> timeLimits;
        public List<ProgrammingLanguage> allowedProgrammingLanguages;
        public String serviceToCreate;
    }

}
