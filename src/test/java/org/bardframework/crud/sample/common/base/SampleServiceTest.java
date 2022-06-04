package org.bardframework.crud.sample.common.base;

import org.bardframework.crud.api.base.BaseServiceTest;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.runner.config.NonWebTestSupport;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class SampleServiceTest<M extends SampleModelAbstract, C extends SampleCriteriaAbstract, D, S extends SampleServiceAbstract<M, C, D, ?>, P extends SampleDataProviderService<M, C, D, S, ?>> implements BaseServiceTest<M, C, D, S, P, String, SampleUser>, NonWebTestSupport {

    @Autowired
    private S service;
    @Autowired
    private P dataProvider;

    @Override
    public S getService() {
        return service;
    }

    @Override
    public P getDataProvider() {
        return dataProvider;
    }
}
