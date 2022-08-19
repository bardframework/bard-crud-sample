package org.bardframework.crud.sample.common.base;

import org.apache.commons.lang3.RandomStringUtils;
import org.bardframework.commons.utils.ReflectionUtils;
import org.bardframework.crud.api.base.*;
import org.bardframework.crud.sample.common.SampleUser;

import java.util.UUID;

public abstract class SampleDataProviderService<M extends BaseModel<I>, C extends BaseCriteria<I>, D, S extends BaseService<M, C, D, R, I, SampleUser>, R extends BaseRepository<M, C, I, SampleUser>, I extends Comparable<? super I>> implements DataProviderService<M, C, D, S, R, I, SampleUser> {

    private final S service;
    private final Class<C> criteriaClazz;

    protected SampleDataProviderService(S service) {
        this.service = service;
        this.criteriaClazz = ReflectionUtils.getGenericArgType(this.getClass(), 1);
    }

    @Override
    public S getService() {
        return service;
    }

    @Override
    public C getEmptyCriteria() {
        return ReflectionUtils.newInstance(criteriaClazz);
    }

    @Override
    public SampleUser getUser() {
        return new SampleUser(UUID.randomUUID().toString(), RandomStringUtils.randomAlphabetic(50));
    }
}
