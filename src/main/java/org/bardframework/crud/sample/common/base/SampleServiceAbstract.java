package org.bardframework.crud.sample.common.base;

import org.bardframework.crud.api.base.BaseCriteria;
import org.bardframework.crud.api.base.BaseModel;
import org.bardframework.crud.api.base.BaseRepository;
import org.bardframework.crud.api.base.BaseService;
import org.bardframework.crud.sample.common.SampleUser;

public abstract class SampleServiceAbstract<M extends BaseModel<I>, C extends BaseCriteria<I>, D, R extends BaseRepository<M, C, I, SampleUser>, I> extends BaseService<M, C, D, R, I, SampleUser> {

    public SampleServiceAbstract(R repository) {
        super(repository);
    }
}
