package org.bardframework.crud.sample.common.base;

import org.bardframework.crud.api.base.BaseRepository;
import org.bardframework.crud.sample.common.User;

public interface SampleRepository<M extends SampleModelAbstract, C extends SampleCriteriaAbstract> extends BaseRepository<M, C, String, User> {
}
