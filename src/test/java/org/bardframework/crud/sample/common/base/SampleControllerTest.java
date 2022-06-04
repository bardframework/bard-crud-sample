package org.bardframework.crud.sample.common.base;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.bardframework.commons.web.WebTestHelper;
import org.bardframework.crud.sample.runner.config.WebTestSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
public abstract class SampleControllerTest implements WebTestHelper, WebTestSupport {

    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private MockMvc mockMvc;

    public MockMvc getMockMvc() {
        return mockMvc;
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }
}
