package org.bardframework.crud.sample.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.bardframework.base.crud.RestControllerTestAbstract;
import org.bardframework.base.jackson.JacksonConfig;
import org.bardframework.crud.sample.Application;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

@ExtendWith(SpringExtension.class)
@Import(Application.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource("classpath:test.properties")
@ContextConfiguration(locations = {"classpath:develop-configuration/**/**.xml", "classpath*:test-configuration.xml"}, classes = JacksonConfig.class)
@AutoConfigureMockMvc
public abstract class SampleRestControllerTestAbstract<M extends SampleBaseModelAbstract, C extends SampleBaseCriteriaAbstract, D, P extends SampleDataProviderServiceAbstract<M, C, D, ?, ?>> implements RestControllerTestAbstract<M, C, D, P, String, SampleUser> {

    @Autowired
    private P dataProvider;
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private TestRestTemplate restTemplate;

    @Override
    public SampleUser getUser() {
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