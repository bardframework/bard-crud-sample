package org.bardframework.crud.sample.sample;

import org.bardframework.crud.sample.common.CrudSampleBaseModelAbstract;

public class SampleModel extends CrudSampleBaseModelAbstract {
    private String email;
    private String displayName;
    private String description;

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
