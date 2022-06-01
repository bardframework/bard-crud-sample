package org.bardframework.crud.sample.app.employee;

import org.bardframework.crud.sample.common.BaseServiceAbstract;
import org.bardframework.crud.sample.common.User;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService extends BaseServiceAbstract<EmployeeModel, EmployeeCriteria, EmployeeDto, EmployeeRepository> {

    public EmployeeService(EmployeeRepository repository) {
        super(repository);
    }

    @Override
    protected EmployeeModel onSave(EmployeeDto dto, User user) {
        EmployeeModel model = new EmployeeModel();
        model.setEmail(dto.getEmail());
        model.setFirstName(dto.getFirstName());
        model.setLastName(dto.getLastName());
        model.setDescription(dto.getDescription());
        return model;
    }

    @Override
    protected EmployeeModel onUpdate(EmployeeDto dto, EmployeeModel model, User user) {
        model.setEmail(dto.getEmail());
        model.setFirstName(dto.getFirstName());
        model.setLastName(dto.getLastName());
        model.setDescription(dto.getDescription());
        return model;
    }
}
