package org.bardframework.crud.sample.runner;

import org.assertj.core.api.Assertions;
import org.bardframework.crud.sample.common.base.SampleRestControllerTest;
import org.junit.jupiter.api.Test;

public class ApplicationTest extends SampleRestControllerTest {

    @Test
    public void checkMetrics() {
        Assertions.assertThat(this.getRestTemplate().getForObject("/actuator/health", String.class)).contains("UP");
    }
}
