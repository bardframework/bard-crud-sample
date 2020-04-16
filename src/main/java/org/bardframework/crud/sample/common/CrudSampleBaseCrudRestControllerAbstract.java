package org.bardframework.crud.sample.common;

import org.bardframework.base.crud.BaseCrudRestControllerAbstract;
import org.bardframework.validator.BardSmartValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.util.UUID;

public abstract class CrudSampleBaseCrudRestControllerAbstract<M extends CrudSampleBaseModelAbstract, C extends CrudSampleBaseCriteriaAbstract, D, S extends CrudSampleBaseServiceAbstract<M, C, D, ?>> extends BaseCrudRestControllerAbstract<M, C, D, S, String, CrudSampleUser> {

    @Autowired
    protected BardSmartValidator smartValidator;

    protected CrudSampleBaseCrudRestControllerAbstract(S service) {
        super(service);
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(this.smartValidator);
    }

    @Override
    public CrudSampleUser getUser() {
        return new CrudSampleUser(UUID.randomUUID().toString(), "anonymous");
    }
}
