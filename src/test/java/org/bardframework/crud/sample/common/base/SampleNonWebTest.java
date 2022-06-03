package org.bardframework.crud.sample.common.base;

import org.bardframework.commons.spring.boot.ConfigsConfiguration;
import org.bardframework.crud.sample.runner.config.AppConfiguration;
import org.bardframework.crud.sample.runner.config.QueryDslConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.web.bind.annotation.RestController;

@ActiveProfiles({"dev", "test"})
@SpringJUnitConfig(SampleNonWebTest.NonWebTestConfiguration.class)
public interface SampleNonWebTest {

    @ComponentScan(basePackages = {"org.bardframework.crud.sample"}, excludeFilters = {@ComponentScan.Filter(value = {Configuration.class, RestController.class})})
    @Import({AppConfiguration.class, ConfigsConfiguration.class, QueryDslConfiguration.class})
    class NonWebTestConfiguration {

    }
}
