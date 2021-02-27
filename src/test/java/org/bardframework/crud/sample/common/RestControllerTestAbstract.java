package org.bardframework.crud.sample.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.bardframework.crud.sample.runner.configuration.BaseWebTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

@AutoConfigureMockMvc
public abstract class RestControllerTestAbstract<M extends BaseModelAbstract, C extends BaseCriteriaAbstract, D, P extends DataProviderServiceAbstract<M, C, D, ?, ?>> implements org.bardframework.crud.api.base.RestControllerTestAbstract<M, C, D, P, String, User>, BaseWebTest {

    @Autowired
    private P dataProvider;
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private TestRestTemplate restTemplate;

    @Override
    public User getUser() {
        return DataProviderUtils.getUser();
    }

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
