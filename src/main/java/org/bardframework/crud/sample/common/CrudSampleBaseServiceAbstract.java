package org.bardframework.crud.sample.common;

import org.bardframework.base.crud.BaseServiceAbstract;

public abstract class CrudSampleBaseServiceAbstract<M extends CrudSampleBaseModelAbstract, C extends CrudSampleBaseCriteriaAbstract, D, R extends CrudSampleBaseRepositoryQdslSqlAbstract<M, C>> extends BaseServiceAbstract<M, C, D, R, String, CrudSampleUser> {
}
