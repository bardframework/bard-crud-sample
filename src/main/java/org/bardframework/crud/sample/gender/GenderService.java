package org.bardframework.crud.sample.gender;

import org.bardframework.crud.sample.common.SampleBaseServiceAbstract;
import org.bardframework.crud.sample.common.SampleUser;
import org.springframework.stereotype.Service;

@Service
public class GenderService extends SampleBaseServiceAbstract<GenderModel, GenderCriteria, Object, GenderRepository> {
    @Override
    protected GenderModel onSave(Object dto, SampleUser user) {
        throw new IllegalStateException("not supported");
    }

    @Override
    protected GenderModel onUpdate(Object dto, GenderModel model, SampleUser user) {
        throw new IllegalStateException("not supported");
    }
}
