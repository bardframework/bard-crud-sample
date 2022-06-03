package org.bardframework.crud.sample.common.base;

import org.bardframework.crud.api.base.BaseService;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.validator.BardSmartValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

public abstract class SampleRestControllerAbstract<S extends BaseService<?, ?, ?, String, SampleUser>> extends SampleControllerAbstract {
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
