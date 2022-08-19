package org.bardframework.crud.sample.app.customer;

import org.apache.commons.lang3.RandomStringUtils;
import org.assertj.core.api.Assertions;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.common.base.SampleDataProviderService;
import org.springframework.stereotype.Service;

@Service
public class CustomerDataProvider extends SampleDataProviderService<CustomerModel, CustomerCriteria, CustomerDto, CustomerService, CustomerRepository, String> {

    public CustomerDataProvider(CustomerService service) {
        super(service);
    }

    @Override
    public CustomerDto getDto() {
        CustomerDto dto = new CustomerDto();
        dto.setEmail(RandomStringUtils.randomAlphabetic(10, 30));
        dto.setFirstName(RandomStringUtils.randomAlphabetic(1, 10));
        dto.setLastName(RandomStringUtils.randomAlphabetic(1, 10));
        dto.setDescription(RandomStringUtils.randomAlphanumeric(0, 100));
        return dto;
    }

    @Override
    public void assertEqualUpdate(CustomerModel model, CustomerDto dto) {
        Assertions.assertThat(model.getEmail()).isEqualTo(dto.getEmail());
        Assertions.assertThat(model.getDescription()).isEqualTo(dto.getDescription());
        Assertions.assertThat(model.getFirstName()).isEqualTo(dto.getFirstName());
        Assertions.assertThat(model.getLastName()).isEqualTo(dto.getLastName());
    }

    @Override
    public void makeInvalid(CustomerDto dto) {
        dto.setFirstName(RandomStringUtils.randomAlphabetic(500));
    }

    @Override
    public String getInvalidId() {
        return RandomStringUtils.randomAlphanumeric(100, 200);
    }

    @Override
    public void assertEqualUpdate(CustomerModel first, CustomerModel second) {
        Assertions.assertThat(first.getEmail()).isEqualTo(second.getEmail());
        Assertions.assertThat(first.getDescription()).isEqualTo(second.getDescription());
        Assertions.assertThat(first.getFirstName()).isEqualTo(second.getFirstName());
        Assertions.assertThat(first.getLastName()).isEqualTo(second.getLastName());
    }

    @Override
    public void makeInvalid(CustomerModel model) {
        model.setEmail(null);
    }

    @Override
    public boolean isDuplicate(CustomerModel first, CustomerModel second, SampleUser user) {
        return false;
    }
}
