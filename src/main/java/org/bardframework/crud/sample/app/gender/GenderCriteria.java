package org.bardframework.crud.sample.app.gender;

import org.bardframework.crud.sample.common.BaseCriteriaAbstract;

public class GenderCriteria extends BaseCriteriaAbstract {

    private String searchQuery;

    public String getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(String searchQuery) {
        this.searchQuery = searchQuery;
    }
}
