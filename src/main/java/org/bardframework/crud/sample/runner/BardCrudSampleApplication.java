package org.bardframework.crud.sample.runner;

import org.bardframework.commons.monitoring.MonitoringConfiguration;
import org.bardframework.commons.spring.boot.ConfigsConfiguration;
import org.bardframework.commons.spring.boot.CorsConfiguration;
import org.bardframework.commons.swagger.SwaggerConfiguration;
import org.bardframework.crud.sample.runner.config.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.mvc.method.annotation.GenericRequestBodyResolverConfiguration;

@SpringBootApplication(exclude = {DataSourceTransactionManagerAutoConfiguration.class})
@Import({
        AppConfiguration.class,
        WebConfiguration.class,
        SecurityConfiguration.class,
        QueryDslConfiguration.class,
        GenericRequestBodyResolverConfiguration.class,
        JacksonConfiguration.class,
        ConfigsConfiguration.class,
        MonitoringConfiguration.class,
        SwaggerConfiguration.class,
        CorsConfiguration.class,
})
@ComponentScan(basePackages = {"org.bardframework.crud.sample"}, excludeFilters = {@ComponentScan.Filter(value = {Configuration.class})})
public class BardCrudSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(BardCrudSampleApplication.class, args);
    }

}
