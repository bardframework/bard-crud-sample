package org.bardframework.crud.sample.common;

import org.bardframework.crud.sample.common.base.SampleCriteriaAbstract;
import org.bardframework.crud.sample.common.base.SampleModelAbstract;
import org.bardframework.crud.sample.common.base.SampleRepository;

public abstract class DataProviderRepositoryAbstract<M extends SampleModelAbstract, C extends SampleCriteriaAbstract, R extends SampleRepository<M, C>> extends org.bardframework.crud.api.base.DataProviderRepositoryAbstract<M, C, R, String, User> {

    public DataProviderRepositoryAbstract(R repository) {
        super(repository);
    }

    @Override
    public String getInvalidId() {
        return DataProviderUtils.getInvalidId();
    }
}
