package org.bardframework.crud.sample.common;

import org.bardframework.base.crud.ServiceTestAbstract;

public abstract class SampleServiceTestAbstract<M extends SampleBaseModelAbstract, C extends SampleBaseCriteriaAbstract, D, S extends SampleBaseServiceAbstract<M, C, D, ?>, P extends SampleDataProviderServiceAbstract<M, C, D, S, ?>> extends ServiceTestAbstract<M, C, D, S, P, String, SampleUser> {

    @Override
    protected SampleUser getUser() {
        return DataProviderUtils.getUser();
    }
}
