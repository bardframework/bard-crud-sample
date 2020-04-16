package org.bardframework.crud.sample.common;

import org.bardframework.base.crud.DataProviderServiceAbstract;

public abstract class SampleDataProviderServiceAbstract<M extends SampleBaseModelAbstract, C extends SampleBaseCriteriaAbstract, D, S extends SampleBaseServiceAbstract<M, C, D, R>, R extends SampleBaseRepository<M, C>> extends DataProviderServiceAbstract<M, C, D, S, R, String, SampleUser> {

    @Override
    public String getInvalidId() {
        return DataProviderUtils.getInvalidId();
    }
}
