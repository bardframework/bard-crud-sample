package org.bardframework.crud.sample.common;

import org.bardframework.commons.spring.boot.ConfigsConfiguration;
import org.bardframework.crud.sample.runner.AppConfiguration;
import org.bardframework.crud.sample.runner.QueryDslConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.bind.annotation.RestController;

@ActiveProfiles({"dev", "test"})
@ComponentScan(basePackages = {"org.bardframework.crud.sample"}, excludeFilters = {@ComponentScan.Filter(value = {Configuration.class, RestController.class})})
@Import({AppConfiguration.class, ConfigsConfiguration.class, QueryDslConfiguration.class})
public class NonWebTestConfiguration {

}
