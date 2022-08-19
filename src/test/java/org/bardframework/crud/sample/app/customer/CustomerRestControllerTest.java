package org.bardframework.crud.sample.app.customer;

import com.fasterxml.jackson.core.type.TypeReference;
import org.bardframework.crud.api.base.PagedData;
import org.bardframework.crud.api.base.ReadRestControllerTest;
import org.bardframework.crud.api.base.WriteRestControllerTest;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.common.base.SampleRestControllerTest;

class CustomerRestControllerTest extends SampleRestControllerTest<CustomerRestController, CustomerDataProvider> implements
        ReadRestControllerTest<CustomerModel, CustomerCriteria, CustomerDataProvider, String, SampleUser>,
        WriteRestControllerTest<CustomerModel, CustomerDto, CustomerDataProvider, String, SampleUser> {

    @Override
    public TypeReference<CustomerModel> getModelTypeReference() {
        return new TypeReference<CustomerModel>() {
        };
    }

    @Override
    public TypeReference<? extends PagedData<CustomerModel>> getDataModelTypeReference() {
        return new TypeReference<PagedData<CustomerModel>>() {
        };
    }
}
