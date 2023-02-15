package com.createService.domain.practiceProblem.models;

import com.createService.domain.common.models.DateTime;
import com.createService.domain.common.models.Id;
import com.createService.domain.common.models.IdentifiedVersioningDomainObject;

public class Problem extends IdentifiedVersioningDomainObject {
    private Id coreProblemId;
    private Difficulty difficulty;
    private DateTime createdAt;

    private Problem(Id id, long version, Id coreProblemId, Difficulty difficulty, DateTime createdAt) {
        super(id, version);
        this.coreProblemId = coreProblemId;
        this.difficulty = difficulty;
        this.createdAt = createdAt;
    }


    public Id getcoreProblemId() {
        return coreProblemId;
    }

    public void setcoreProblemId(Id coreProblemId) {
        this.coreProblemId = coreProblemId;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public DateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }

    public static Problem createPracticeProblem(Id coreProblemId, Difficulty difficulty) {
        return new Problem(
                Id.generateRandom(),
                0,
                coreProblemId,
                difficulty,
                DateTime.now()
        );
    }
}
