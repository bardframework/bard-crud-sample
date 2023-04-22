package org.bardframework.crud.sample.runner.config;

import org.bardframework.commons.spring.boot.ConfigsConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.web.bind.annotation.RestController;

@ActiveProfiles({"test", "h2Db"})
@SpringJUnitConfig(NonWebTestSupport.NonWebTestConfiguration.class)
public interface NonWebTestSupport {

    @ComponentScan(basePackages = {"org.bardframework.crud.sample"}, excludeFilters = {@ComponentScan.Filter(value = {Configuration.class, RestController.class})})
    @Import({AppConfiguration.class, ConfigsConfiguration.class, DataSourceAutoConfiguration.class, AppTestConfiguration.class, QueryDslConfiguration.class})
    class NonWebTestConfiguration {

    }
}
