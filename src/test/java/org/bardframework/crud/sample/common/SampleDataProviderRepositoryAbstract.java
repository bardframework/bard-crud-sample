package org.bardframework.crud.sample.common;

import org.bardframework.base.crud.DataProviderRepositoryAbstract;

public abstract class SampleDataProviderRepositoryAbstract<M extends SampleBaseModelAbstract, C extends SampleBaseCriteriaAbstract, R extends SampleBaseRepository<M, C>> extends DataProviderRepositoryAbstract<M, C, R, String, SampleUser> {
    @Override
    public String getInvalidId() {
        return DataProviderUtils.getInvalidId();
    }
}
