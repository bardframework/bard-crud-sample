package org.bardframework.crud.sample.common;

import org.bardframework.crud.api.base.BaseRepository;

public interface SampleBaseRepository<M extends SampleBaseModelAbstract, C extends SampleBaseCriteriaAbstract> extends BaseRepository<M, C, String, SampleUser> {
}
