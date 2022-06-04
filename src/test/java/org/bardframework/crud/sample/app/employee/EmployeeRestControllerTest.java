package org.bardframework.crud.sample.app.employee;

import com.fasterxml.jackson.core.type.TypeReference;
import org.bardframework.crud.api.base.PagedData;
import org.bardframework.crud.api.base.ReadRestControllerTest;
import org.bardframework.crud.api.base.WriteRestControllerTest;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.common.base.SampleCrudControllerTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

class EmployeeRestControllerTest extends SampleCrudControllerTest<EmployeeRestController, EmployeeDataProvider> implements
        ReadRestControllerTest<EmployeeModel, EmployeeCriteria, EmployeeDataProvider, String, SampleUser>,
        WriteRestControllerTest<EmployeeModel, EmployeeDto, EmployeeDataProvider, String, SampleUser> {

    @Test
    void create() {
        EmployeeDto dto = this.getDataProvider().getDto();
        ResponseEntity<String> response = this.post(this.BASE_URL(), dto, String.class, HttpStatus.CREATED);
        Assertions.assertEquals(HttpStatus.CREATED, response.getStatusCode());
    }

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
