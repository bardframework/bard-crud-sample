package org.bardframework.crud.sample.gender;

import org.bardframework.crud.sample.common.SampleBaseCriteriaAbstract;

public class GenderCriteria extends SampleBaseCriteriaAbstract {

    private String searchQuery;

    public String getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(String searchQuery) {
        this.searchQuery = searchQuery;
    }
}
