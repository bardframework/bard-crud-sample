package org.bardframework.crud.sample.app.customer;

import org.bardframework.crud.api.base.ReadRestController;
import org.bardframework.crud.api.base.WriteRestController;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.common.base.SampleRestControllerAbstract;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "customer", produces = APPLICATION_JSON_VALUE)
public class CustomerRestController extends
        SampleRestControllerAbstract<CustomerService> implements
        ReadRestController<CustomerModel, CustomerCriteria, CustomerService, String, SampleUser>,
        WriteRestController<CustomerModel, CustomerDto, CustomerService, String, SampleUser> {

    protected CustomerRestController(CustomerService service) {
        super(service);
    }
}
