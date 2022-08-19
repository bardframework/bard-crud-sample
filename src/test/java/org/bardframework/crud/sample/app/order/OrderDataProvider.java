package org.bardframework.crud.sample.app.order;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.assertj.core.api.Assertions;
import org.bardframework.crud.sample.app.customer.CustomerDataProvider;
import org.bardframework.crud.sample.app.product.ProductDataProvider;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.common.base.SampleDataProviderService;
import org.springframework.stereotype.Service;

@Service
public class OrderDataProvider extends SampleDataProviderService<OrderModel, OrderCriteria, OrderDto, OrderService, OrderRepository, OrderModel.OrderKey> {

    private final CustomerDataProvider customerDataProvider;
    private final ProductDataProvider productDataProvider;

    protected OrderDataProvider(OrderService service, CustomerDataProvider customerDataProvider, ProductDataProvider productDataProvider) {
        super(service);
        this.productDataProvider = productDataProvider;
        this.customerDataProvider = customerDataProvider;
    }

    @Override
    public OrderDto getDto() {
        OrderDto dto = new OrderDto();
        dto.setCustomerId(customerDataProvider.getId(null));
        dto.setProductId(productDataProvider.getId(null));
        dto.setCount(RandomUtils.nextInt());
        return dto;
    }

    @Override
    public void assertEqualSave(OrderModel model, OrderDto dto) {
        Assertions.assertThat(model.getId().getCustomerId()).isEqualTo(dto.getCustomerId());
        Assertions.assertThat(model.getId().getProductId()).isEqualByComparingTo(dto.getProductId());
        Assertions.assertThat(model.getCount()).isEqualTo(dto.getCount());
    }

    @Override
    public void assertEqualUpdate(OrderModel model, OrderDto dto) {
        Assertions.assertThat(model.getCount()).isEqualTo(dto.getCount());
    }

    @Override
    public void makeInvalid(OrderDto dto) {
        dto.setCount(-1 * RandomUtils.nextInt());
    }

    @Override
    public OrderModel.OrderKey getInvalidId() {
        return new OrderModel.OrderKey(RandomStringUtils.random(50), RandomUtils.nextInt());
    }

    @Override
    public void assertEqualSave(OrderModel first, OrderModel second) {
        Assertions.assertThat(first.getId()).isEqualTo(second.getId());
        Assertions.assertThat(first.getCount()).isEqualTo(second.getCount());
    }

    @Override
    public void assertEqualUpdate(OrderModel first, OrderModel second) {
        Assertions.assertThat(first.getCount()).isEqualTo(second.getCount());
    }

    @Override
    public void makeInvalid(OrderModel model) {
        model.setId(null);
    }

    @Override
    public boolean isDuplicate(OrderModel first, OrderModel second, SampleUser user) {
        return false;
    }
}
