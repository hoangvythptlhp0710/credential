package com.createService.domain.practiceProblem.repositories;

import com.createService.domain.common.models.Id;
import com.createService.domain.problem.model.Problem;

public interface PracticeProblemRepository {
    Problem getById(Id id);
    void create(com.createService.domain.practiceProblem.models.Problem problem);
}
