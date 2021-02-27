package org.bardframework.crud.sample.common;

public interface BaseRepository<M extends BaseModelAbstract, C extends BaseCriteriaAbstract> extends org.bardframework.crud.api.base.BaseRepository<M, C, String, User> {
}
