package org.bardframework.crud.sample.common;

public abstract class DataProviderRepositoryAbstract<M extends BaseModelAbstract, C extends BaseCriteriaAbstract, R extends BaseRepository<M, C>> extends org.bardframework.crud.api.base.DataProviderRepositoryAbstract<M, C, R, String, User> {

    public DataProviderRepositoryAbstract(R repository) {
        super(repository);
    }

    @Override
    public String getInvalidId() {
        return DataProviderUtils.getInvalidId();
    }
}
