package org.bardframework.crud.sample.app.employee;

import org.bardframework.crud.sample.common.controller.CrudRestControllerAbstract;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = EmployeeRestController.PATH, produces = APPLICATION_JSON_VALUE)
public class EmployeeRestController extends CrudRestControllerAbstract<EmployeeModel, EmployeeCriteria, EmployeeDto, EmployeeService> {

    public static final String PATH = "employee";
}
