package org.bardframework.crud.sample.runner;

import org.bardframework.commons.spring.boot.ConfigsConfiguration;
import org.bardframework.crud.sample.runner.config.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.mvc.method.annotation.GenericRequestBodyResolverConfiguration;

@SpringBootApplication(exclude = {
        ErrorMvcAutoConfiguration.class,
        ValidationAutoConfiguration.class,
        JacksonAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        UserDetailsServiceAutoConfiguration.class
})
@Import({
        AppConfiguration.class,
        WebConfiguration.class,
        SecurityConfiguration.class,
        QueryDslConfiguration.class,
        GenericRequestBodyResolverConfiguration.class,
        JacksonConfiguration.class,
        ConfigsConfiguration.class
})
@ComponentScan(basePackages = {"org.bardframework.crud.sample"}, excludeFilters = {@ComponentScan.Filter(value = {Configuration.class})})
public class BardCrudSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(BardCrudSampleApplication.class, args);
    }

}
