package org.bardframework.crud.sample.app.order;

import com.fasterxml.jackson.core.type.TypeReference;
import org.bardframework.crud.api.base.PagedData;
import org.bardframework.crud.api.base.ReadRestControllerTest;
import org.bardframework.crud.api.base.WriteRestControllerTest;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.common.base.SampleRestControllerTest;

class OrderRestControllerTest extends SampleRestControllerTest<OrderRestController, OrderDataProvider, OrderModel.OrderKey> implements
        ReadRestControllerTest<OrderModel, OrderCriteria, OrderDataProvider, OrderModel.OrderKey, SampleUser>,
        WriteRestControllerTest<OrderModel, OrderDto, OrderDataProvider, OrderModel.OrderKey, SampleUser> {

    @Override
    public TypeReference<OrderModel> getModelTypeReference() {
        return new TypeReference<OrderModel>() {
        };
    }

    @Override
    public TypeReference<? extends PagedData<OrderModel>> getDataModelTypeReference() {
        return new TypeReference<PagedData<OrderModel>>() {
        };
    }
}
