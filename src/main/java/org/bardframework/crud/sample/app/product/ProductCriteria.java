package org.bardframework.crud.sample.app.product;

import org.bardframework.crud.api.base.BaseCriteriaAbstract;
import org.bardframework.form.model.filter.DoubleFilter;

public class ProductCriteria extends BaseCriteriaAbstract<Integer> {

    private DoubleFilter priceFilter;

    public DoubleFilter getPriceFilter() {
        return priceFilter;
    }

    public void setPriceFilter(DoubleFilter priceFilter) {
        this.priceFilter = priceFilter;
    }
}
