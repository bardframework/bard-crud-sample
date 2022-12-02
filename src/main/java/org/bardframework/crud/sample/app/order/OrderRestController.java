package org.bardframework.crud.sample.app.order;

import org.bardframework.crud.api.base.ReadRestController;
import org.bardframework.crud.api.base.WriteRestController;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.common.base.SampleRestControllerAbstract;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "api/order", produces = APPLICATION_JSON_VALUE)
public class OrderRestController extends
        SampleRestControllerAbstract<OrderService, OrderModel.OrderKey> implements
        ReadRestController<OrderModel, OrderCriteria, OrderService, OrderModel.OrderKey, SampleUser>,
        WriteRestController<OrderModel, OrderDto, OrderService, OrderModel.OrderKey, SampleUser> {

    protected OrderRestController(OrderService service) {
        super(service);
    }
}
