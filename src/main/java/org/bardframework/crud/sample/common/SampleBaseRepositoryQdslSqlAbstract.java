package org.bardframework.crud.sample.common;

import org.bardframework.base.crud.BaseRepositoryQdslSqlAbstract;

public abstract class SampleBaseRepositoryQdslSqlAbstract<M extends SampleBaseModelAbstract, C extends SampleBaseCriteriaAbstract> extends BaseRepositoryQdslSqlAbstract<M, C, String, SampleUser> implements SampleBaseRepository<M, C> {
}
