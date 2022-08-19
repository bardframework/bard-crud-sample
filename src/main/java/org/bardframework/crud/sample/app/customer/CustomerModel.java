package org.bardframework.crud.sample.app.customer;

import org.bardframework.crud.sample.common.base.SampleModelAbstract;

public class CustomerModel extends SampleModelAbstract {
    private String email;
    private String firstName;
    private String lastName;
    private String description;

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
