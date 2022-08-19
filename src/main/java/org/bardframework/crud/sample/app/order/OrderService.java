package org.bardframework.crud.sample.app.order;

import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.common.base.SampleServiceAbstract;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends SampleServiceAbstract<OrderModel, OrderCriteria, OrderDto, OrderRepository, OrderModel.OrderKey> {

    public OrderService(OrderRepository repository) {
        super(repository);
    }

    @Override
    protected void preSave(OrderDto dto, SampleUser user) {
        if (dto.getCount() < 0) {
            throw new IllegalArgumentException("negative count not acceptable");
        }
    }

    @Override
    protected OrderModel onSave(OrderDto dto, SampleUser user) {
        OrderModel entity = new OrderModel();
        entity.setId(new OrderModel.OrderKey(dto.getCustomerId(), dto.getProductId()));
        entity.setCount(dto.getCount());
        return entity;
    }

    @Override
    protected void preUpdate(OrderModel previousModel, OrderDto dto, SampleUser user) {
        if (dto.getCount() < 0) {
            throw new IllegalArgumentException("negative count not acceptable");
        }
    }

    @Override
    protected void onUpdate(OrderDto dto, OrderModel entity, SampleUser user) {
        entity.setCount(dto.getCount());
    }
}
