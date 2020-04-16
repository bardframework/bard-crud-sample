package org.bardframework.crud.sample.sample;

import org.bardframework.crud.sample.common.CrudSampleBaseServiceAbstract;
import org.bardframework.crud.sample.common.CrudSampleUser;
import org.springframework.stereotype.Service;

@Service
public class SampleService extends CrudSampleBaseServiceAbstract<SampleModel, SampleCriteria, SampleDto, SampleRepositoryQdslSqlImpl> {
    @Override
    protected SampleModel onSave(SampleDto dto, CrudSampleUser user) {
        SampleModel model = new SampleModel();
        model.setEmail(dto.getEmail());
        model.setDisplayName(dto.getDisplayName());
        model.setDescription(dto.getDescription());
        return model;
    }

    @Override
    protected SampleModel onUpdate(SampleDto dto, SampleModel model, CrudSampleUser user) {
        model.setEmail(dto.getEmail());
        model.setDisplayName(dto.getDisplayName());
        model.setDescription(dto.getDescription());
        return model;
    }
}
