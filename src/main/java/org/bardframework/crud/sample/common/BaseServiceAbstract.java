package org.bardframework.crud.sample.common;

public abstract class BaseServiceAbstract<M extends BaseModelAbstract, C extends BaseCriteriaAbstract, D, R extends BaseRepository<M, C>> extends org.bardframework.crud.api.base.BaseServiceAbstract<M, C, D, R, String, User> {
}
