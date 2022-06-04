package org.bardframework.crud.sample.app.employee;

import org.apache.commons.lang3.RandomStringUtils;
import org.assertj.core.api.Assertions;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.common.base.SampleDataProviderService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDataProvider extends SampleDataProviderService<EmployeeModel, EmployeeCriteria, EmployeeDto, EmployeeService, EmployeeRepository> {

    public EmployeeDataProvider(EmployeeService service) {
        super(service);
    }

    @Override
    public EmployeeDto getDto() {
        EmployeeDto dto = new EmployeeDto();
        dto.setEmail(RandomStringUtils.randomAlphabetic(1, 10));
        dto.setFirstName(RandomStringUtils.randomAlphabetic(1, 10));
        dto.setLastName(RandomStringUtils.randomAlphabetic(1, 10));
        dto.setDescription(RandomStringUtils.randomAlphanumeric(0, 100));
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
    public void makeInvalid(EmployeeDto dto) {
        dto.setFirstName(RandomStringUtils.randomAlphabetic(500));
    }

    @Override
    public void assertEqualUpdate(EmployeeModel first, EmployeeModel second) {
        Assertions.assertThat(first.getEmail()).isEqualTo(second.getEmail());
        Assertions.assertThat(first.getDescription()).isEqualTo(second.getDescription());
        Assertions.assertThat(first.getFirstName()).isEqualTo(second.getFirstName());
        Assertions.assertThat(first.getLastName()).isEqualTo(second.getLastName());
    }

    @Override
    public void makeInvalid(EmployeeModel model) {
        model.setEmail(null);
    }

    @Override
    public boolean isDuplicate(EmployeeModel first, EmployeeModel second, SampleUser user) {
        return false;
    }
}
