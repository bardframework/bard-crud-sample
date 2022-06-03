package org.bardframework.crud.sample.app.gender;

import org.bardframework.crud.sample.common.base.SampleCriteriaAbstract;

public class GenderCriteria extends SampleCriteriaAbstract {

    private String searchQuery;

    public String getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(String searchQuery) {
        this.searchQuery = searchQuery;
    }
}
