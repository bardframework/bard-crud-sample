package org.bardframework.crud.sample.app.employee;

import org.bardframework.crud.sample.common.base.SampleCriteriaAbstract;
import org.bardframework.form.filter.StringFilter;

public class EmployeeCriteria extends SampleCriteriaAbstract {

    private StringFilter searchQuery;

    public StringFilter getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(StringFilter searchQuery) {
        this.searchQuery = searchQuery;
    }
}
