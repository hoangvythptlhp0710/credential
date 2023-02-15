package com.createService.domain.problem.repositories;

import com.createService.domain.problem.model.Problem;

public interface ProblemRepository {
    void create(Problem problem);
}
