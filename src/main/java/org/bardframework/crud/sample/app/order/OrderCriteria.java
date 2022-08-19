package org.bardframework.crud.sample.app.order;

import org.bardframework.crud.api.base.BaseCriteriaAbstract;
import org.bardframework.form.model.filter.IdFilter;

public class OrderCriteria extends BaseCriteriaAbstract<OrderModel.OrderKey> {

    private IdFilter<String> customerIdFilter;
    private IdFilter<Integer> productIdFilter;

    public IdFilter<String> getCustomerIdFilter() {
        return customerIdFilter;
    }

    public void setCustomerIdFilter(IdFilter<String> customerIdFilter) {
        this.customerIdFilter = customerIdFilter;
    }

    public IdFilter<Integer> getProductIdFilter() {
        return productIdFilter;
    }

    public void setProductIdFilter(IdFilter<Integer> productIdFilter) {
        this.productIdFilter = productIdFilter;
    }
}
