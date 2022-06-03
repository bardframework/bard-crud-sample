package org.bardframework.crud.sample.base;

import org.bardframework.crud.api.base.DataProviderRepository;
import org.bardframework.crud.api.base.RepositoryTest;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.common.base.SampleCriteriaAbstract;
import org.bardframework.crud.sample.common.base.SampleModelAbstract;
import org.bardframework.crud.sample.common.base.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class SampleRepositoryTest<M extends SampleModelAbstract, C extends SampleCriteriaAbstract, R extends SampleRepository<M, C>, P extends DataProviderRepository<M, C, R, String, SampleUser>> implements RepositoryTest<M, C, R, P, String, SampleUser>, SampleNonWebTest {

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
