package org.bardframework.crud.sample.app.order;

import com.fasterxml.jackson.databind.JavaType;
import org.bardframework.crud.api.base.ReadRestControllerTest;
import org.bardframework.crud.api.base.WriteRestControllerTest;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.common.base.SampleRestControllerTest;

class OrderRestControllerTest extends SampleRestControllerTest<OrderRestController, OrderDataProvider, OrderModel.OrderKey> implements
        ReadRestControllerTest<OrderModel, OrderCriteria, OrderDataProvider, OrderModel.OrderKey, SampleUser>,
        WriteRestControllerTest<OrderModel, OrderDto, OrderDataProvider, OrderModel.OrderKey, SampleUser> {

    @Override
    public Class<OrderModel> getModelClass() {
        return OrderModel.class;
    }

    @Override
    public JavaType getModelJavaType() {
        return ReadRestControllerTest.super.getModelJavaType();
    }
}
