package org.bardframework.crud.sample.sample;

import org.bardframework.base.crud.BaseCrudRestControllerAbstract;
import org.bardframework.validator.BardSmartValidator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "sample", produces = APPLICATION_JSON_VALUE)
public class SampleRestController extends BaseCrudRestControllerAbstract<SampleModel, SampleCriteria, SampleDto, SampleService, String, String> {

    protected final BardSmartValidator smartValidator;

    protected SampleRestController(SampleService service, BardSmartValidator smartValidator) {
        super(service);
        this.smartValidator = smartValidator;
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
