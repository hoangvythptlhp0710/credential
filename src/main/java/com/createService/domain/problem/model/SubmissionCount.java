package com.createService.domain.problem.model;

import com.createService.domain.common.models.Id;
import com.createService.domain.common.models.VersioningDomainObject;

public class SubmissionCount extends VersioningDomainObject {

    private Id problemId;
    private long ACsCount;
    private long submissionsCount;
    private String serviceToCreate;

    public SubmissionCount(long version, Id problemId, long ACsCount, long submissionsCount, String serviceToCreate) {
        super(version);
        this.problemId = problemId;
        this.ACsCount = ACsCount;
        this.submissionsCount =submissionsCount;
        this.serviceToCreate = serviceToCreate;
    }

    public Id getProblemId() {
        return problemId;
    }

    public void setProblemId(Id problemId) {
        this.problemId = problemId;
    }

    public long getACsCount() {
        return ACsCount;
    }

    public void setACsCount(Long ACsCount) {
        this.ACsCount = ACsCount;
    }

    public long getSubmissionsCount() {
        return submissionsCount;
    }

    public void setSubmissionsCount(Long submissionsCount) {
        this.submissionsCount = submissionsCount;
    }

    public String getServiceToCreate() {
        return serviceToCreate;
    }

    public void setServiceToCreate(String serviceToCreate) {
        this.serviceToCreate = serviceToCreate;
    }

    public static SubmissionCount create(Id problemId, String serviceToCreate) {
        return new SubmissionCount(
                0,
                problemId,
                0,
                0,
                serviceToCreate
        );
    }
}
