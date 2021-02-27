package org.bardframework.crud.sample.common;

public abstract class DataProviderServiceAbstract<M extends BaseModelAbstract, C extends BaseCriteriaAbstract, D, S extends BaseServiceAbstract<M, C, D, R>, R extends BaseRepository<M, C>> extends org.bardframework.crud.api.base.DataProviderServiceAbstract<M, C, D, S, R, String, User> {

    @Override
    public String getInvalidId() {
        return DataProviderUtils.getInvalidId();
    }
}
