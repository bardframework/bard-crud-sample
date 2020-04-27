package org.bardframework.crud.sample.employee;

import com.fasterxml.jackson.core.type.TypeReference;
import org.bardframework.crud.sample.common.SampleRestControllerTestAbstract;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

class EmployeeRestControllerTest extends SampleRestControllerTestAbstract<EmployeeModel, EmployeeCriteria, EmployeeDto, EmployeeDataProvider> {

    @Test
    void create() {
        EmployeeDto dto = this.getDataProvider().getDto(this.getUser());
        ResponseEntity<String> response = this.post(this.BASE_URL(), dto, String.class, HttpStatus.CREATED);
        Assertions.assertEquals(HttpStatus.CREATED, response.getStatusCode());
    }

    @Override
    public String BASE_URL() {
        return '/' + EmployeeRestController.PATH;
    }

    @Override
    public TypeReference<EmployeeModel> getModelTypeReference() {
        return new TypeReference<EmployeeModel>() {
        };
    }

    @Override
    public TypeReference<? extends Page<EmployeeModel>> getDataModelTypeReference() {
        return new TypeReference<Page<EmployeeModel>>() {
        };
    }
}
