package com.createService.domain.problem.model;

public class FailedTestCaseDetail {

    private int failedAtLine;
    private TestCase testCase;

    public FailedTestCaseDetail(){

    }
    public FailedTestCaseDetail(int failedAtLine, TestCase testCase) {
        this.failedAtLine = failedAtLine;
        this.testCase = testCase;
    }

    public int getFailedAtLine() {
        return failedAtLine;
    }

    public TestCase getTestCase() {
        return testCase;
    }
}
