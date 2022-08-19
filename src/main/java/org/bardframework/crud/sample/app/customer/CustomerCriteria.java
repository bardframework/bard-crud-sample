package org.bardframework.crud.sample.app.customer;

import org.bardframework.crud.api.base.BaseCriteriaAbstract;
import org.bardframework.form.model.filter.StringFilter;

public class CustomerCriteria extends BaseCriteriaAbstract<String> {

    private StringFilter searchQuery;

    public StringFilter getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(StringFilter searchQuery) {
        this.searchQuery = searchQuery;
    }
}
