package org.bardframework.crud.sample.sample;

import org.bardframework.base.crud.BaseServiceAbstract;
import org.springframework.stereotype.Service;

@Service
public class SampleService extends BaseServiceAbstract<SampleModel, SampleCriteria, SampleDto, SampleRepositoryQdslSqlImpl, String, String> {
    @Override
    protected SampleModel onSave(SampleDto dto, String user) {
        SampleModel model = new SampleModel();
        model.setEmail(dto.getEmail());
        model.setDisplayName(dto.getDisplayName());
        model.setDescription(dto.getDescription());
        return model;
    }

    @Override
    protected SampleModel onUpdate(SampleDto dto, SampleModel model, String user) {
        model.setEmail(dto.getEmail());
        model.setDisplayName(dto.getDisplayName());
        model.setDescription(dto.getDescription());
        return model;
    }
}
