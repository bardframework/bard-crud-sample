package org.bardframework.crud.sample.common.controller;

import org.bardframework.crud.api.base.BaseRestController;
import org.bardframework.crud.sample.common.SampleUser;

import java.util.UUID;

public abstract class SampleRestControllerAbstract implements BaseRestController<SampleUser> {

    @Override
    public SampleUser getUser() {
        return new SampleUser(UUID.randomUUID().toString(), "anonymous");
    }
}
