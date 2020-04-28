package org.bardframework.crud.sample.employee;

import io.github.jhipster.service.filter.StringFilter;
import org.bardframework.crud.sample.common.SampleBaseCriteriaAbstract;

public class EmployeeCriteria extends SampleBaseCriteriaAbstract {

    private StringFilter searchQuery;

    public StringFilter getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(StringFilter searchQuery) {
        this.searchQuery = searchQuery;
    }
}
