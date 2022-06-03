package org.bardframework.crud.sample.app.employee;

import org.bardframework.crud.api.base.ReadRestController;
import org.bardframework.crud.api.base.WriteRestController;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.common.base.SampleRestControllerAbstract;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "employee", produces = APPLICATION_JSON_VALUE)
public class EmployeeRestController extends
        SampleRestControllerAbstract<EmployeeService> implements
        ReadRestController<EmployeeModel, EmployeeCriteria, EmployeeService, String, SampleUser>,
        WriteRestController<EmployeeModel, EmployeeDto, EmployeeService, String, SampleUser> {

    protected EmployeeRestController(EmployeeService service) {
        super(service);
    }
}
