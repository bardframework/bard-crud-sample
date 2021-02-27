package org.bardframework.crud.sample.app.employee;

import org.assertj.core.api.Assertions;
import org.bardframework.crud.sample.common.DataProviderServiceAbstract;
import org.bardframework.crud.sample.common.DataProviderUtils;
import org.bardframework.crud.sample.common.User;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDataProvider extends DataProviderServiceAbstract<EmployeeModel, EmployeeCriteria, EmployeeDto, EmployeeService, EmployeeRepository> {

    @Override
    public EmployeeDto getDto(User sampleUser) {
        EmployeeDto dto = new EmployeeDto();
        dto.setEmail(DataProviderUtils.getEmailValid());
        dto.setFirstName(DataProviderUtils.getNameValid());
        dto.setLastName(DataProviderUtils.getNameValid());
        dto.setDescription(DataProviderUtils.getDescriptionValid());
        return dto;
    }

    @Override
    public void assertEqualUpdate(EmployeeModel model, EmployeeDto dto) {
        Assertions.assertThat(model.getEmail()).isEqualTo(dto.getEmail());
        Assertions.assertThat(model.getDescription()).isEqualTo(dto.getDescription());
        Assertions.assertThat(model.getFirstName()).isEqualTo(dto.getFirstName());
        Assertions.assertThat(model.getLastName()).isEqualTo(dto.getLastName());
    }

    @Override
    protected EmployeeDto makeInvalid(EmployeeDto dto) {
        dto.setFirstName(DataProviderUtils.getInvalidName());
        return dto;
    }

    @Override
    public void assertEqualUpdate(EmployeeModel first, EmployeeModel second) {
        Assertions.assertThat(first.getEmail()).isEqualTo(second.getEmail());
        Assertions.assertThat(first.getDescription()).isEqualTo(second.getDescription());
        Assertions.assertThat(first.getFirstName()).isEqualTo(second.getFirstName());
        Assertions.assertThat(first.getLastName()).isEqualTo(second.getLastName());
    }

    @Override
    protected EmployeeModel makeInvalid(EmployeeModel model) {
        model.setEmail(null);
        return model;
    }
}
