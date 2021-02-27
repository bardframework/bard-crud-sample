package org.bardframework.crud.sample.common.controller;

import org.bardframework.crud.sample.common.BaseCriteriaAbstract;
import org.bardframework.crud.sample.common.BaseModelAbstract;
import org.bardframework.crud.sample.common.BaseServiceAbstract;
import org.bardframework.validator.BardSmartValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

public abstract class OperationRestControllerAbstract<M extends BaseModelAbstract, C extends BaseCriteriaAbstract, D, S extends BaseServiceAbstract<M, C, D, ?>> extends RestControllerAbstract {
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
