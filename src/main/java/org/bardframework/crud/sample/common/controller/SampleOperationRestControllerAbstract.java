package org.bardframework.crud.sample.common.controller;

import org.bardframework.crud.sample.common.SampleBaseCriteriaAbstract;
import org.bardframework.crud.sample.common.SampleBaseModelAbstract;
import org.bardframework.crud.sample.common.SampleBaseServiceAbstract;
import org.bardframework.validator.BardSmartValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

public abstract class SampleOperationRestControllerAbstract<M extends SampleBaseModelAbstract, C extends SampleBaseCriteriaAbstract, D, S extends SampleBaseServiceAbstract<M, C, D, ?>> extends SampleRestControllerAbstract {
    @Autowired
    protected S service;

    @Autowired
    protected BardSmartValidator smartValidator;

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(this.smartValidator);
    }

    public S getService() {
        return service;
    }
}
