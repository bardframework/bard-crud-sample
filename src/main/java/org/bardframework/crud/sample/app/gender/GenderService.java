package org.bardframework.crud.sample.app.gender;

import org.bardframework.crud.sample.common.BaseServiceAbstract;
import org.bardframework.crud.sample.common.User;
import org.springframework.stereotype.Service;

@Service
public class GenderService extends BaseServiceAbstract<GenderModel, GenderCriteria, Object, GenderRepository> {

    public GenderService(GenderRepository repository) {
        super(repository);
    }

    @Override
    protected GenderModel onSave(Object dto, User user) {
        throw new IllegalStateException("not supported");
    }

    @Override
    protected GenderModel onUpdate(Object dto, GenderModel model, User user) {
        throw new IllegalStateException("not supported");
    }
}
