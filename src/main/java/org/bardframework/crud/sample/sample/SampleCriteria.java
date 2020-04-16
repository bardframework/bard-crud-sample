package org.bardframework.crud.sample.sample;

import org.bardframework.crud.sample.common.CrudSampleBaseCriteriaAbstract;

public class SampleCriteria extends CrudSampleBaseCriteriaAbstract {

    private String searchQuery;

    public String getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(String searchQuery) {
        this.searchQuery = searchQuery;
    }
}
