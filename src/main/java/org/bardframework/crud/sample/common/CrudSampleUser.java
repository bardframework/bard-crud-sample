package org.bardframework.crud.sample.common;

public class CrudSampleUser {
    private final String userId;
    private final String username;

    public CrudSampleUser(String userId, String username) {
        this.userId = userId;
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }
}
