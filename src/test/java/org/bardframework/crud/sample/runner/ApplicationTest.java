package org.bardframework.crud.sample.runner;

import org.assertj.core.api.Assertions;
import org.bardframework.crud.sample.common.base.SampleControllerTest;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

public class ApplicationTest extends SampleControllerTest {

    @Test
    public void checkMetrics() throws Exception {
        MvcResult result = this.execute(MockMvcRequestBuilders.get("/actuator/health"), HttpStatus.OK);
        Assertions.assertThat(result.getResponse().getContentAsString()).contains("UP");
    }
}
