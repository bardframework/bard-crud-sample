package org.bardframework.crud.sample.employee;

import org.bardframework.crud.sample.common.SampleBaseServiceAbstract;
import org.bardframework.crud.sample.common.SampleUser;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService extends SampleBaseServiceAbstract<EmployeeModel, EmployeeCriteria, EmployeeDto, EmployeeRepository> {
    @Override
    protected EmployeeModel onSave(EmployeeDto dto, SampleUser user) {
        EmployeeModel model = new EmployeeModel();
        model.setEmail(dto.getEmail());
        model.setFirstName(dto.getFirstName());
        model.setLastName(dto.getLastName());
        model.setDescription(dto.getDescription());
        return model;
    }

    @Override
    protected EmployeeModel onUpdate(EmployeeDto dto, EmployeeModel model, SampleUser user) {
        model.setEmail(dto.getEmail());
        model.setFirstName(dto.getFirstName());
        model.setLastName(dto.getLastName());
        model.setDescription(dto.getDescription());
        return model;
    }
}
