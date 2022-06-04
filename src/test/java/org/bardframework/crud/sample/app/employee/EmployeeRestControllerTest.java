package org.bardframework.crud.sample.app.employee;

import com.fasterxml.jackson.core.type.TypeReference;
import org.bardframework.crud.api.base.PagedData;
import org.bardframework.crud.api.base.ReadRestControllerTest;
import org.bardframework.crud.api.base.WriteRestControllerTest;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.common.base.SampleRestControllerTest;

class EmployeeRestControllerTest extends SampleRestControllerTest<EmployeeRestController, EmployeeDataProvider> implements
        ReadRestControllerTest<EmployeeModel, EmployeeCriteria, EmployeeDataProvider, String, SampleUser>,
        WriteRestControllerTest<EmployeeModel, EmployeeDto, EmployeeDataProvider, String, SampleUser> {

    @Override
    public TypeReference<EmployeeModel> getModelTypeReference() {
        return new TypeReference<EmployeeModel>() {
        };
    }

    @Override
    public TypeReference<? extends PagedData<EmployeeModel>> getDataModelTypeReference() {
        return new TypeReference<PagedData<EmployeeModel>>() {
        };
    }
}
