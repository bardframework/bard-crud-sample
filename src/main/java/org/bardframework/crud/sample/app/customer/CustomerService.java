package org.bardframework.crud.sample.app.customer;

import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.common.base.SampleServiceAbstract;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends SampleServiceAbstract<CustomerModel, CustomerCriteria, CustomerDto, CustomerRepository> {

    public CustomerService(CustomerRepository repository) {
        super(repository);
    }

    @Override
    protected CustomerModel onSave(CustomerDto dto, SampleUser user) {
        CustomerModel model = new CustomerModel();
        model.setEmail(dto.getEmail());
        model.setFirstName(dto.getFirstName());
        model.setLastName(dto.getLastName());
        model.setDescription(dto.getDescription());
        return model;
    }

    @Override
    protected void onUpdate(CustomerDto dto, CustomerModel model, SampleUser user) {
        model.setEmail(dto.getEmail());
        model.setFirstName(dto.getFirstName());
        model.setLastName(dto.getLastName());
        model.setDescription(dto.getDescription());
    }
}
