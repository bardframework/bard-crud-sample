package org.bardframework.crud.sample.app.order;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.bardframework.crud.api.base.BaseCriteriaAbstract;
import org.bardframework.form.model.filter.IdFilter;

@Getter
@Setter
@ToString
public class OrderCriteria extends BaseCriteriaAbstract<OrderModel.OrderKey> {

    private IdFilter<String> customerIdFilter;
    private IdFilter<Integer> productIdFilter;
}
