package org.bardframework.crud.sample.common.base;

import org.bardframework.crud.api.base.BaseServiceAbstract;
import org.bardframework.crud.sample.common.SampleUser;

public abstract class SampleServiceAbstract<M extends SampleModelAbstract, C extends SampleCriteriaAbstract, D, R extends SampleRepository<M, C>> extends BaseServiceAbstract<M, C, D, R, String, SampleUser> {

    public SampleServiceAbstract(R repository) {
        super(repository);
    }
}
