package org.bardframework.crud.sample.common.entity;

import org.bardframework.base.crud.BaseCriteriaAbstract;
import org.bardframework.base.crud.BaseCrudRestControllerAbstract;
import org.bardframework.base.crud.BaseModelAbstract;
import org.bardframework.base.crud.BaseService;
import org.bardframework.crud.sample.sample.SampleCriteria;
import org.bardframework.crud.sample.sample.SampleDto;
import org.bardframework.crud.sample.sample.SampleModel;
import org.bardframework.crud.sample.sample.SampleService;
import org.bardframework.validator.BardSmartValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

public abstract class CrudSampleBaseCrudRestControllerAbstract<M extends BaseModelAbstract<String>, C extends BaseCriteriaAbstract<String>, D, S extends BaseService<M, C, D, String, String>> extends BaseCrudRestControllerAbstract<M, C, D, S, String, String> {

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
    public String getUser() {
        return "anonymous";
    }
}
