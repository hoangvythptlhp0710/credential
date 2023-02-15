package com.createService.domain.problem.model;

import com.createService.domain.common.models.DateTime;
import com.createService.domain.common.models.Id;
import com.createService.domain.common.models.IdentifiedDomainObject;

import java.util.List;

public class Submission extends IdentifiedDomainObject {

    private ProgrammingLanguage programmingLanguage;
    private Millisecond runtime;
    private KB memory;
    private DateTime submittedAt;
    private String code;
    private Status status;
    private String output;
    private FailedTestCaseDetail failedTestCaseDetail;
    private Id problemId;
    private String serviceToCreate;

    public Submission(ProgrammingLanguage programmingLanguage, Millisecond runtime, KB memory, DateTime submittedAt, String code, Status status, String output, FailedTestCaseDetail failedTestCaseDetail, Id problemId, String serviceToCreate) {
        super(problemId);
        this.programmingLanguage = programmingLanguage;
        this.runtime = runtime;
        this.memory = memory;
        this.submittedAt = submittedAt;
        this.code = code;
        this.status = status;
        this.output = output;
        this.failedTestCaseDetail = failedTestCaseDetail;
        this.problemId = problemId;
        this.serviceToCreate = serviceToCreate;
    }

    public ProgrammingLanguage getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(ProgrammingLanguage programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public Millisecond getRuntime() {
        return runtime;
    }

    public void setRuntime(Millisecond runtime) {
        this.runtime = runtime;
    }

    public KB getMemory() {
        return memory;
    }

    public void setMemory(KB memory) {
        this.memory = memory;
    }

    public DateTime getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(DateTime submittedAt) {
        this.submittedAt = submittedAt;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public FailedTestCaseDetail getFailedTestCaseDetail() {
        return failedTestCaseDetail;
    }

    public void setFailedTestCaseDetail(FailedTestCaseDetail failedTestCaseDetail) {
        this.failedTestCaseDetail = failedTestCaseDetail;
    }

    public Id getProblemId() {
        return problemId;
    }

    public void setProblemId(Id problemId) {
        this.problemId = problemId;
    }

    public String getServiceToCreate() {
        return serviceToCreate;
    }

    public void setServiceToCreate(String serviceToCreate) {
        this.serviceToCreate = serviceToCreate;
    }

}
