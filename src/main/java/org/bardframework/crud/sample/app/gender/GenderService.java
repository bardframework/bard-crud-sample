package org.bardframework.crud.sample.app.gender;

import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.common.base.SampleServiceAbstract;
import org.springframework.stereotype.Service;

@Service
public class GenderService extends SampleServiceAbstract<GenderModel, GenderCriteria, Object, GenderRepository, String> {

    public GenderService(GenderRepository repository) {
        super(repository);
    }

    @Override
    protected GenderModel onSave(Object dto, SampleUser user) {
        throw new IllegalStateException("not supported");
    }

    @Override
    protected void onUpdate(Object dto, GenderModel model, SampleUser user) {
        throw new IllegalStateException("not supported");
    }
}
