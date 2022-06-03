package org.bardframework.crud.sample.common;

import org.bardframework.crud.sample.common.base.SampleCriteriaAbstract;
import org.bardframework.crud.sample.common.base.SampleModelAbstract;
import org.bardframework.crud.sample.common.base.SampleRepository;
import org.bardframework.crud.sample.common.base.SampleServiceAbstract;

public abstract class DataProviderServiceAbstract<M extends SampleModelAbstract, C extends SampleCriteriaAbstract, D, S extends SampleServiceAbstract<M, C, D, R>, R extends SampleRepository<M, C>> extends org.bardframework.crud.api.base.DataProviderServiceAbstract<M, C, D, S, R, String, User> {

    public DataProviderServiceAbstract(S service) {
        super(service);
    }

    @Override
    public String getInvalidId() {
        return DataProviderUtils.getInvalidId();
    }
}
