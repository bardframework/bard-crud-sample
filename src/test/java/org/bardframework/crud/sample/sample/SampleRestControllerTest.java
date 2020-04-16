package org.bardframework.crud.sample.sample;

import org.bardframework.commons.utils.RandomStringUtils;
import org.bardframework.commons.utils.RandomUtils;
import org.bardframework.crud.sample.BaseTestControllerAbstract;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

class SampleRestControllerTest extends BaseTestControllerAbstract {

    private static final String CREATE_URL = "/sample";

    @Autowired
    private SampleDataProvider dataProvider;

    @Test
    void create() {
        SampleDto dto = dataProvider.getDtoValid();
        ResponseEntity<String> response = super.post(CREATE_URL, dto, String.class, HttpStatus.OK);
        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    void createWithInvalidEmail() {
        SampleDto dto = dataProvider.getDtoValid();
        dto.setEmail(RandomUtils.nextBoolean() ? RandomStringUtils.randomAlphabetic(200, 300) : null);
        ResponseEntity<String> response = super.post(CREATE_URL, dto, String.class, HttpStatus.NOT_ACCEPTABLE);
        Assertions.assertEquals(HttpStatus.NOT_ACCEPTABLE, response.getStatusCode());
    }

    @Test
    void createWithInvalidDisplayName() {
        SampleDto dto = dataProvider.getDtoValid();
        dto.setDisplayName(RandomStringUtils.randomAlphabetic(200, 500));
        ResponseEntity<String> response = super.post(CREATE_URL, dto, String.class, HttpStatus.NOT_ACCEPTABLE);
        Assertions.assertEquals(HttpStatus.NOT_ACCEPTABLE, response.getStatusCode());
    }

    @Test
    void createWithInvalidDescription() {
        SampleDto dto = dataProvider.getDtoValid();
        dto.setDescription(RandomStringUtils.randomAlphabetic(500, 1000));
        ResponseEntity<String> response = super.post(CREATE_URL, dto, String.class, HttpStatus.NOT_ACCEPTABLE);
        Assertions.assertEquals(HttpStatus.NOT_ACCEPTABLE, response.getStatusCode());
    }
}
