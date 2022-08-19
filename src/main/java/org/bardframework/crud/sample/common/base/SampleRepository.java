package org.bardframework.crud.sample.common.base;

import org.bardframework.crud.api.base.BaseCriteria;
import org.bardframework.crud.api.base.BaseModel;
import org.bardframework.crud.api.base.BaseRepository;
import org.bardframework.crud.sample.common.SampleUser;

public interface SampleRepository<M extends BaseModel<I>, C extends BaseCriteria<I>, I extends Comparable<? super I>> extends BaseRepository<M, C, I, SampleUser> {
}
