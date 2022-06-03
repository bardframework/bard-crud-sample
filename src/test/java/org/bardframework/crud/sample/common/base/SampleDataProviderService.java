package org.bardframework.crud.sample.common.base;

import org.apache.commons.lang3.RandomStringUtils;
import org.bardframework.commons.utils.ReflectionUtils;
import org.bardframework.crud.api.base.DataProviderService;
import org.bardframework.crud.sample.common.SampleUser;

import java.util.UUID;

public abstract class SampleDataProviderService<M extends SampleModelAbstract, C extends SampleCriteriaAbstract, D, S extends SampleServiceAbstract<M, C, D, R>, R extends SampleRepository<M, C>> implements DataProviderService<M, C, D, S, R, String, SampleUser> {

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

    @Override
    public String getInvalidId() {
        return RandomStringUtils.randomAlphanumeric(100, 200);
    }
}
