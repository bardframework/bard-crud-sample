package org.bardframework.crud.sample.app.gender;

import org.bardframework.crud.sample.common.base.SampleCriteriaAbstract;
import org.bardframework.form.model.filter.StringFilter;

public class GenderCriteria extends SampleCriteriaAbstract {

    private StringFilter searchQuery;

    public StringFilter getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(StringFilter searchQuery) {
        this.searchQuery = searchQuery;
    }
}
