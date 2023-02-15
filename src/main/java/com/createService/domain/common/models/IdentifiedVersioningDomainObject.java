package com.createService.domain.common.models;

public class IdentifiedVersioningDomainObject extends IdentifiedDomainObject {

    private long version;
    public IdentifiedVersioningDomainObject(Id id, long version) {
        super(id);
        this.version = version;
    }

    public long getVersion() {
        return version;
    }

    public void increaseVersion() {
        version++;
    }
}
