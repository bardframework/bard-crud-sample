package org.bardframework.crud.sample.common;

import org.bardframework.base.crud.BaseServiceAbstract;

public abstract class SampleBaseServiceAbstract<M extends SampleBaseModelAbstract, C extends SampleBaseCriteriaAbstract, D, R extends SampleBaseRepository<M, C>> extends BaseServiceAbstract<M, C, D, R, String, SampleUser> {
}
