package org.bardframework.crud.sample;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@Import(Application.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource("classpath:test.properties")
@ContextConfiguration(locations = {"classpath:develop-configuration/**/**.xml", "classpath*:test-configuration.xml"})
public abstract class BaseTestControllerAbstract {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseTestControllerAbstract.class);
    @Autowired
    protected TestRestTemplate restTemplate;

    protected <T> ResponseEntity<T> post(String uri, Object dto, Class<T> responseType, HttpStatus status) {
        ResponseEntity<T> responseEntity;
        responseEntity = restTemplate.exchange(uri, HttpMethod.POST, new HttpEntity<>(dto), responseType);
        LOGGER.info("response of calling [{}] is [{}]", uri, responseEntity.getBody());
        Assertions.assertThat(responseEntity.getStatusCodeValue()).isEqualTo(status.value());
        return responseEntity;
    }
}
