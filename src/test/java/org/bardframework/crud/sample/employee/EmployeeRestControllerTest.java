package org.bardframework.crud.sample.employee;

import org.bardframework.crud.sample.common.SampleRestControllerTestAbstract;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

class EmployeeRestControllerTest extends SampleRestControllerTestAbstract<EmployeeModel, EmployeeCriteria, EmployeeDto, EmployeeDataProvider> {

    @Test
    void create() {
        EmployeeDto dto = this.getDataProvider().getDto(this.getUser());
        ResponseEntity<String> response = this.post(this.BASE_URL(), dto, String.class, HttpStatus.OK);
        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    protected <T> ResponseEntity<T> post(String uri, Object dto, Class<T> responseType, HttpStatus status) {
        ResponseEntity<T> responseEntity;
        responseEntity = this.getRestTemplate().exchange(uri, HttpMethod.POST, new HttpEntity<>(dto), responseType);
        LOGGER.info("response of calling [{}] is [{}]", uri, responseEntity.getBody());
        org.assertj.core.api.Assertions.assertThat(responseEntity.getStatusCodeValue()).isEqualTo(status.value());
        return responseEntity;
    }

    @Override
    public String BASE_URL() {
        return '/' + EmployeeRestController.PATH;
    }
}
