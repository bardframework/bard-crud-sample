package org.bardframework.crud.sample.sample;

import org.bardframework.validator.BardSmartValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "sample", produces = APPLICATION_JSON_VALUE)
public class SampleRestController {

    @Autowired
    protected BardSmartValidator smartValidator;

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(this.smartValidator);
    }

    @PostMapping(value = "", consumes = APPLICATION_JSON_VALUE)
    public SampleModel create(@RequestBody @Validated SampleDto request) {
        SampleModel model = new SampleModel();
        model.setId(UUID.randomUUID().toString());
        model.setDescription(request.getDescription());
        model.setDisplayName(request.getDisplayName());
        model.setEmail(request.getEmail());
        return model;
    }
}
