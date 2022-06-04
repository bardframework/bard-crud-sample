package org.bardframework.crud.sample.common.base;

import org.bardframework.crud.api.base.BaseRepositoryTest;
import org.bardframework.crud.api.base.DataProviderRepository;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.runner.config.NonWebTestSupport;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class SampleRepositoryTest<M extends SampleModelAbstract, C extends SampleCriteriaAbstract, R extends SampleRepository<M, C>, P extends DataProviderRepository<M, C, R, String, SampleUser>> implements BaseRepositoryTest<M, C, R, P, String, SampleUser>, NonWebTestSupport {

    @Autowired
    private R repository;
    @Autowired
    private P dataProvider;

    @Override
    public R getRepository() {
        return repository;
    }

    @Override
    public P getDataProvider() {
        return dataProvider;
    }
}
