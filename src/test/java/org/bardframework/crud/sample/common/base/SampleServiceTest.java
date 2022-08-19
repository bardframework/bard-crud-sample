package org.bardframework.crud.sample.common.base;

import org.bardframework.crud.api.base.BaseCriteria;
import org.bardframework.crud.api.base.BaseModel;
import org.bardframework.crud.api.base.BaseService;
import org.bardframework.crud.api.base.BaseServiceTest;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.runner.config.NonWebTestSupport;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class SampleServiceTest<M extends BaseModel<I>, C extends BaseCriteria<I>, D, S extends BaseService<M, C, D, ?, I, SampleUser>, P extends SampleDataProviderService<M, C, D, S, ?, I>, I extends Comparable<? super I>> implements BaseServiceTest<M, C, D, S, P, I, SampleUser>, NonWebTestSupport {

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
