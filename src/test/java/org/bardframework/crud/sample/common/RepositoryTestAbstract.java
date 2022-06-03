package org.bardframework.crud.sample.common;

import org.bardframework.crud.api.base.DataProviderRepositoryAbstract;
import org.bardframework.crud.sample.common.base.SampleCriteriaAbstract;
import org.bardframework.crud.sample.common.base.SampleModelAbstract;
import org.bardframework.crud.sample.common.base.SampleRepository;

public abstract class RepositoryTestAbstract<M extends SampleModelAbstract, C extends SampleCriteriaAbstract, R extends SampleRepository<M, C>, P extends DataProviderRepositoryAbstract<M, C, R, String, User>> extends org.bardframework.crud.api.base.RepositoryTestAbstract<M, C, R, P, String, User> implements BaseNonWebTest {

    @Override
    protected User getUser() {
        return DataProviderUtils.getUser();
    }
}
