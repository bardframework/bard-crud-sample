package org.bardframework.crud.sample.runner.config;

import org.bardframework.crud.sample.runner.BardCrudSampleApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

@ActiveProfiles({"dev", "test"})
@ContextConfiguration(classes = {BardCrudSampleApplication.class, TestConfiguration.class})
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public interface WebTestSupport {

}
