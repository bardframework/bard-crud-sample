package org.bardframework.crud.sample.employee;

import org.bardframework.crud.sample.common.SampleBaseCriteriaAbstract;

public class EmployeeCriteria extends SampleBaseCriteriaAbstract {

    private String searchQuery;

    public String getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(String searchQuery) {
        this.searchQuery = searchQuery;
    }
}
