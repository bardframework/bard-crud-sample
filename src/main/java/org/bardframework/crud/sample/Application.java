package org.bardframework.crud.sample;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.bardframework.commons.spring.boot.SpringBootRunner;
import org.bardframework.commons.web.filter.ExceptionHandlerFilter;
import org.bardframework.crud.sample.config.JacksonConfiguration;
import org.bardframework.crud.sample.config.JdbcConfig;
import org.bardframework.crud.sample.config.SampleConfiguration;
import org.bardframework.crud.sample.config.SampleExceptionControllerAdvice;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.*;
import org.springframework.core.Ordered;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class, ValidationAutoConfiguration.class, JacksonAutoConfiguration.class, DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class})
@ComponentScan(basePackages = {"org.bardframework.crud.sample"}, excludeFilters = {@ComponentScan.Filter(value = {Configuration.class})})
@EnableAspectJAutoProxy(proxyTargetClass = true)
@Import({JacksonConfiguration.class, SampleConfiguration.class, SampleExceptionControllerAdvice.class, JdbcConfig.class})
@ImportResource("classpath*:spring-configuration/**/**.xml")
@EnableWebMvc
@EnableTransactionManagement
public class Application implements SpringBootRunner {

    public static void main(String[] args) {
        SpringBootRunner.run(Application.class, args);
    }

    @Bean
    public FilterRegistrationBean<ExceptionHandlerFilter> exceptionHandlerFilter(SampleExceptionControllerAdvice exceptionControllerAdvice, ObjectMapper objectMapper) {
        FilterRegistrationBean<ExceptionHandlerFilter> registrationBean = new FilterRegistrationBean<>(new ExceptionHandlerFilter(exceptionControllerAdvice, objectMapper));
        registrationBean.setOrder(Ordered.HIGHEST_PRECEDENCE);
        return registrationBean;
    }
}
