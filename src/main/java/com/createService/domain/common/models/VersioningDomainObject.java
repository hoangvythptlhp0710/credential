package com.createService.domain.common.models;

public class VersioningDomainObject {

    private long version;
    public VersioningDomainObject(long version) {
        this.version = version;
    }

    public long getVersion() {
        return version;
    }
}
