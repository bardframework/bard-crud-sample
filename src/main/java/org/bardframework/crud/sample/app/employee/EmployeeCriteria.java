package org.bardframework.crud.sample.app.employee;

import io.github.jhipster.service.filter.StringFilter;
import org.bardframework.crud.sample.common.BaseCriteriaAbstract;

public class EmployeeCriteria extends BaseCriteriaAbstract {

    private StringFilter searchQuery;

    public StringFilter getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(StringFilter searchQuery) {
        this.searchQuery = searchQuery;
    }
}
