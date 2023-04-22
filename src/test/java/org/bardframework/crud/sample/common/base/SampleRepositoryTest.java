package org.bardframework.crud.sample.common.base;

import org.bardframework.crud.api.base.*;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.runner.config.NonWebTestSupport;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class SampleRepositoryTest<M extends BaseModel<I>, C extends BaseCriteria<I>, R extends BaseRepository<M, C, I, SampleUser>, P extends RepositoryDataProvider<M, C, R, I, SampleUser>, I> implements BaseRepositoryTest<M, C, R, P, I, SampleUser>, NonWebTestSupport {

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
