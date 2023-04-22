package org.bardframework.crud.sample.common.base;

import lombok.Getter;
import org.bardframework.crud.api.base.ReadService;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.validator.BardSmartValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

@Getter
public abstract class SampleRestControllerAbstract<S extends ReadService<?, ?, ?, I, SampleUser>, I> extends SampleControllerAbstract {
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

}
