package org.bardframework.crud.sample.common;

import org.bardframework.crud.sample.common.base.SampleCriteriaAbstract;
import org.bardframework.crud.sample.common.base.SampleModelAbstract;
import org.bardframework.crud.sample.common.base.SampleServiceAbstract;

public abstract class ServiceTestAbstract<M extends SampleModelAbstract, C extends SampleCriteriaAbstract, D, S extends SampleServiceAbstract<M, C, D, ?>, P extends DataProviderServiceAbstract<M, C, D, S, ?>> extends org.bardframework.crud.api.base.ServiceTestAbstract<M, C, D, S, P, String, User> implements BaseNonWebTest {

    @Override
    protected User getUser() {
        return DataProviderUtils.getUser();
    }
}
