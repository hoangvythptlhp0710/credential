package com.createService.domain.problem.model;

import com.createService.domain.common.models.Id;
import com.createService.domain.common.models.IdentifiedDomainObject;

public class TestCase  {

    private Id problemId;

    private String input;
    private String expectedOutput;
    private int ordinal;
    private boolean isSample;
    private String description;

    public TestCase(Id problemId, String input, String expectedOutput, int ordinal, boolean isSample, String description) {
        this.problemId = problemId;
        this.input = input;
        this.expectedOutput = expectedOutput;
        this.ordinal = ordinal;
        this.isSample = isSample;
        this.description = description;
    }

    public Id getProblemId() {
        return problemId;
    }

    public void setProblemId(Id problemId) {
        this.problemId = problemId;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getExpectedOutput() {
        return expectedOutput;
    }

    public void setExpectedOutput(String expectedOutput) {
        this.expectedOutput = expectedOutput;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(int ordinal) {
        this.ordinal = ordinal;
    }

    public boolean isSample() {
        return isSample;
    }

    public void setSample(boolean sample) {
        isSample = sample;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
