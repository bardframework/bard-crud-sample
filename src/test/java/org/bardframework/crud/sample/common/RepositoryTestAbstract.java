package org.bardframework.crud.sample.common;

import org.bardframework.crud.api.base.DataProviderRepositoryAbstract;

public abstract class RepositoryTestAbstract<M extends BaseModelAbstract, C extends BaseCriteriaAbstract, R extends BaseRepository<M, C>, P extends DataProviderRepositoryAbstract<M, C, R, String, User>> extends org.bardframework.crud.api.base.RepositoryTestAbstract<M, C, R, P, String, User> implements BaseNonWebTest {

    @Override
    protected User getUser() {
        return DataProviderUtils.getUser();
    }
}
