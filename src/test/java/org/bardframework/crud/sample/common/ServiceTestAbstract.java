package org.bardframework.crud.sample.common;

import org.bardframework.crud.sample.runner.configuration.BaseNonWebTest;

public abstract class ServiceTestAbstract<M extends BaseModelAbstract, C extends BaseCriteriaAbstract, D, S extends BaseServiceAbstract<M, C, D, ?>, P extends DataProviderServiceAbstract<M, C, D, S, ?>> extends org.bardframework.crud.api.base.ServiceTestAbstract<M, C, D, S, P, String, User> implements BaseNonWebTest {

    @Override
    protected User getUser() {
        return DataProviderUtils.getUser();
    }
}
