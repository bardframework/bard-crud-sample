package org.bardframework.crud.sample.runner.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.bardframework.commons.web.filter.ExceptionHandlerFilter;
import org.bardframework.crud.sample.app.order.OrderModel;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfiguration implements WebMvcConfigurer {

    @Bean
    public FilterRegistrationBean<ExceptionHandlerFilter> exceptionHandlerFilter(SampleExceptionControllerAdvice exceptionControllerAdvice, ObjectMapper objectMapper) {
        ExceptionHandlerFilter filter = new ExceptionHandlerFilter(exceptionControllerAdvice, objectMapper);
        FilterRegistrationBean<ExceptionHandlerFilter> registrationBean = new FilterRegistrationBean<>(filter);
        registrationBean.setOrder(Ordered.HIGHEST_PRECEDENCE);
        return registrationBean;
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new OrderModel.OrderKey());
    }
}
