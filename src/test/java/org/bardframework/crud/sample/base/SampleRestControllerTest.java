package org.bardframework.crud.sample.base;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.bardframework.crud.api.base.RestControllerTest;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.common.base.SampleCriteriaAbstract;
import org.bardframework.crud.sample.common.base.SampleModelAbstract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

@AutoConfigureMockMvc
public abstract class SampleRestControllerTest<M extends SampleModelAbstract, C extends SampleCriteriaAbstract, D, P extends SampleDataProviderService<M, C, D, ?, ?>> implements RestControllerTest<M, C, D, P, String, SampleUser>, SampleWebTest {

    @Autowired
    private P dataProvider;
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private TestRestTemplate restTemplate;

    @Override
    public P getDataProvider() {
        return dataProvider;
    }

    @Override
    public MockMvc getMockMvc() {
        return mockMvc;
    }

    @Override
    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    @Override
    public MockHttpServletRequestBuilder setAuthentication(MockHttpServletRequestBuilder requestBuilder) {
        return requestBuilder;
    }

    public TestRestTemplate getRestTemplate() {
        return restTemplate;
    }
}
