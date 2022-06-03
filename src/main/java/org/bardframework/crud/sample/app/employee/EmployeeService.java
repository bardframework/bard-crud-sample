package org.bardframework.crud.sample.app.employee;

import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.common.base.SampleServiceAbstract;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService extends SampleServiceAbstract<EmployeeModel, EmployeeCriteria, EmployeeDto, EmployeeRepository> {

    public EmployeeService(EmployeeRepository repository) {
        super(repository);
    }

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
    protected void onUpdate(EmployeeDto dto, EmployeeModel model, SampleUser user) {
        model.setEmail(dto.getEmail());
        model.setFirstName(dto.getFirstName());
        model.setLastName(dto.getLastName());
        model.setDescription(dto.getDescription());
    }
}
