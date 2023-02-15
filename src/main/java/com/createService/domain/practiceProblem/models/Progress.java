package com.createService.domain.practiceProblem.models;

import com.createService.domain.common.models.Id;
import com.createService.domain.common.models.VersioningDomainObject;

public class Progress extends VersioningDomainObject {

    private Id coderId;
    private int solvedEasyProblem;
    private int solvedMediumProblem;
    private int solvedHardProblem;

    public Progress(long version, Id coderId, int solvedEasyProblem, int solvedMediumProblem, int solvedHardProblem) {
        super(version);
        this.coderId = coderId;
        this.solvedEasyProblem = solvedEasyProblem;
        this.solvedMediumProblem = solvedMediumProblem;
        this.solvedHardProblem = solvedHardProblem;
    }

    public Id getCoderId() {
        return coderId;
    }

    public int getSolvedEasyProblem() {
        return solvedEasyProblem;
    }

    public int getSolvedMediumProblem() {
        return solvedMediumProblem;
    }

    public int getSolvedHardProblem() {
        return solvedHardProblem;
    }
}
