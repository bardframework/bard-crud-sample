package org.bardframework.crud.sample.common.base;

import org.bardframework.crud.api.base.BaseService;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.validator.BardSmartValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.io.Serializable;

public abstract class SampleRestControllerAbstract<S extends BaseService<?, ?, ?, ?, I, SampleUser>, I extends Serializable> extends SampleControllerAbstract {
    protected final S service;

    @Autowired
    protected BardSmartValidator smartValidator;

    protected SampleRestControllerAbstract(S service) {
        this.service = service;
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(this.smartValidator);
    }

    public S getService() {
        return service;
    }
}
