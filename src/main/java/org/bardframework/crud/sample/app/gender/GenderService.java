package org.bardframework.crud.sample.app.gender;

import org.bardframework.crud.api.base.ReadService;
import org.bardframework.crud.sample.common.SampleUser;
import org.springframework.stereotype.Service;

@Service
public class GenderService extends ReadService<GenderModel, GenderCriteria, GenderRepository, String, SampleUser> {

    public GenderService(GenderRepository repository) {
        super(repository);
    }
}
