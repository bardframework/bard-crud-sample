package org.bardframework.crud.sample.employee;

import org.bardframework.crud.sample.common.SampleServiceTestAbstract;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
class EmployeeServiceTest extends SampleServiceTestAbstract<EmployeeModel, EmployeeCriteria, EmployeeDto, EmployeeService, EmployeeDataProvider> {

    @Override
    public void testGetOne() {

    }

    @Override
    public void testDeleteByCriteria() {

    }
}