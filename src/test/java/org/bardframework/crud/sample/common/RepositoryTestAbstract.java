package org.bardframework.crud.sample.common;

import org.bardframework.crud.api.base.DataProviderRepositoryAbstract;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(classes = NonWebTestConfiguration.class)
public abstract class RepositoryTestAbstract<M extends BaseModelAbstract, C extends BaseCriteriaAbstract, R extends BaseRepository<M, C>, P extends DataProviderRepositoryAbstract<M, C, R, String, User>> extends org.bardframework.crud.api.base.RepositoryTestAbstract<M, C, R, P, String, User> {

    @Override
    protected User getUser() {
        return DataProviderUtils.getUser();
    }
}
