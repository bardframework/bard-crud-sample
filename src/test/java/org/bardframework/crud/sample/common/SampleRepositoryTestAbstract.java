package org.bardframework.crud.sample.common;

import org.bardframework.base.crud.DataProviderRepositoryAbstract;
import org.bardframework.base.crud.RepositoryTestAbstract;

public abstract class SampleRepositoryTestAbstract<M extends SampleBaseModelAbstract, C extends SampleBaseCriteriaAbstract, R extends SampleBaseRepository<M, C>, P extends DataProviderRepositoryAbstract<M, C, R, String, SampleUser>> extends RepositoryTestAbstract<M, C, R, P, String, SampleUser> {

    @Override
    protected SampleUser getUser() {
        return DataProviderUtils.getUser();
    }
}
