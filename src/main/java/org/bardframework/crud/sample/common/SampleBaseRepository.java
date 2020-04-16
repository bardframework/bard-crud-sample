package org.bardframework.crud.sample.common;

import org.bardframework.base.crud.BaseRepository;

public interface SampleBaseRepository<M extends SampleBaseModelAbstract, C extends SampleBaseCriteriaAbstract> extends BaseRepository<M, C, String, SampleUser> {
}
