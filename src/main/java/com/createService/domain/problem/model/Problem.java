package com.createService.domain.problem.model;

import com.createService.domain.common.models.Id;
import com.createService.domain.common.models.IdentifiedVersioningDomainObject;
import com.createService.domain.common.exceptions.InvalidInputException;

import java.util.ArrayList;
import java.util.List;

public class Problem extends IdentifiedVersioningDomainObject {
    private String name;
    private String description;
    private Id author;
    private List<MemoryLimit> memoryLimits;
    private List<TimeLimit> timeLimits;
    private List<ProgrammingLanguage> allowedProgrammingLanguage;
    private String serviceToCreate;

    public Problem(Id id, long version, String name, String description, Id author, List<MemoryLimit> memoryLimits, List<TimeLimit> timeLimits, List<ProgrammingLanguage> allowedProgrammingLanguage, String serviceToCreate) {
        super(id, version);
        this.name = name;
        this.description = description;
        this.author = author;
        this.memoryLimits = memoryLimits;
        this.timeLimits = timeLimits;
        this.allowedProgrammingLanguage = allowedProgrammingLanguage;
        this.serviceToCreate = serviceToCreate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Id getAuthor() {
        return author;
    }

    public void setAuthor(Id author) {
        this.author = author;
    }

    public List<MemoryLimit> getMemoryLimits() {
        return memoryLimits;
    }

    public void setMemoryLimits(List<MemoryLimit> memoryLimits) {
        this.memoryLimits = memoryLimits;
    }

    public List<TimeLimit> getTimeLimits() {
        return timeLimits;
    }

    public void setTimeLimits(List<TimeLimit> timeLimits) {
        this.timeLimits = timeLimits;
    }

    public List<ProgrammingLanguage> getAllowedProgrammingLanguage() {
        return allowedProgrammingLanguage;
    }

    public void setAllowedProgrammingLanguage(List<ProgrammingLanguage> allowedProgrammingLanguage) {
        this.allowedProgrammingLanguage = allowedProgrammingLanguage;
    }

    public String getServiceToCreate() {
        return serviceToCreate;
    }

    public void setServiceToCreate(String serviceToCreate) {
        this.serviceToCreate = serviceToCreate;
    }

    public static Problem create(String name,
                                 String description,
                                 Id author,
                                 List<MemoryLimit.CreateInputML> createMemoryLimitInput,
                                 List<TimeLimit.CreateInputTL> createTimeLimitInput,
                                 List<ProgrammingLanguage> allowedProgrammingLanguages,
                                 String serviceToCreate) throws InvalidInputException {
            Problem problem = new Problem(
                    Id.generateRandom(),
                    0,
                    name,
                    description,
                    author,
                    new ArrayList<>(),
                    new ArrayList<>(),
                    allowedProgrammingLanguages,
                    serviceToCreate
            );
            return problem;
    }

}
