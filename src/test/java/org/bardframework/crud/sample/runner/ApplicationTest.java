package org.bardframework.crud.sample.runner;

import org.assertj.core.api.Assertions;
import org.bardframework.crud.sample.common.BaseWebTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;

public class ApplicationTest implements BaseWebTest {

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    public void checkMetrics() {
        Assertions.assertThat(this.restTemplate.getForObject("/actuator/health", String.class)).contains("UP");
    }
}
