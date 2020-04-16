package org.bardframework.crud.sample.sample;

import org.bardframework.crud.sample.common.entity.CrudSampleBaseCrudRestControllerAbstract;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "sample", produces = APPLICATION_JSON_VALUE)
public class SampleRestController extends CrudSampleBaseCrudRestControllerAbstract<SampleModel, SampleCriteria, SampleDto, SampleService> {

    protected SampleRestController(SampleService service) {
        super(service);
    }
}
