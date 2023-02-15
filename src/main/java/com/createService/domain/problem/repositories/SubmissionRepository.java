package com.createService.domain.problem.repositories;

import com.createService.domain.problem.model.Submission;

public interface SubmissionRepository {

    void create(Submission submission);
}
