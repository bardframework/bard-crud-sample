package org.bardframework.crud.sample.common.base;

import org.bardframework.crud.api.base.BaseServiceAbstract;
import org.bardframework.crud.sample.common.User;

public abstract class SampleServiceAbstract<M extends SampleModelAbstract, C extends SampleCriteriaAbstract, D, R extends SampleRepository<M, C>> extends BaseServiceAbstract<M, C, D, R, String, User> {

    public SampleServiceAbstract(R repository) {
        super(repository);
    }
}
