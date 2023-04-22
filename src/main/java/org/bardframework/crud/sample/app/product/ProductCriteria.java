package org.bardframework.crud.sample.app.product;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.bardframework.crud.api.base.BaseCriteriaAbstract;
import org.bardframework.form.model.filter.DoubleFilter;

@Getter
@Setter
@ToString
public class ProductCriteria extends BaseCriteriaAbstract<Integer> {

    private DoubleFilter priceFilter;
}
