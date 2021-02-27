package org.bardframework.crud.sample.common.controller;

import org.bardframework.crud.api.base.BaseRestController;
import org.bardframework.crud.sample.common.User;

import java.util.UUID;

public abstract class RestControllerAbstract implements BaseRestController<User> {

    @Override
    public User getUser() {
        return new User(UUID.randomUUID().toString(), "anonymous");
    }
}
