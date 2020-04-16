package org.bardframework.crud.sample.common;

import org.bardframework.base.crud.BaseCrudRestControllerAbstract;
import org.bardframework.validator.BardSmartValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.util.UUID;

public abstract class SampleBaseCrudRestControllerAbstract<M extends SampleBaseModelAbstract, C extends SampleBaseCriteriaAbstract, D, S extends SampleBaseServiceAbstract<M, C, D, ?>> extends BaseCrudRestControllerAbstract<M, C, D, S, String, SampleUser> {

    @Autowired
    protected BardSmartValidator smartValidator;

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(this.smartValidator);
    }

    @Override
    public SampleUser getUser() {
        return new SampleUser(UUID.randomUUID().toString(), "anonymous");
    }
}
