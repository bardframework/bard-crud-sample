package org.bardframework.crud.sample.sample;

import org.bardframework.base.crud.BaseCriteriaAbstract;

public class SampleCriteria extends BaseCriteriaAbstract<String> {

    private String searchQuery;

    public String getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(String searchQuery) {
        this.searchQuery = searchQuery;
    }
}
