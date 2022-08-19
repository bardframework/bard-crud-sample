package org.bardframework.crud.sample.app.order;

import org.bardframework.crud.sample.common.base.SampleServiceTest;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class OrderServiceTest extends SampleServiceTest<OrderModel, OrderCriteria, OrderDto, OrderService, OrderDataProvider, OrderModel.OrderKey> {

    @AfterAll
    void deleteAll() {
        LOGGER.info("deleting all order records");
        this.getService().getRepository().delete(new OrderCriteria(), null);
    }
}
