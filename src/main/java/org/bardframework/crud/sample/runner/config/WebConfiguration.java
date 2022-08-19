package org.bardframework.crud.sample.runner.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.bardframework.commons.web.filter.ExceptionHandlerFilter;
import org.bardframework.crud.sample.app.order.OrderModel;
import org.bardframework.crud.sample.runner.ExceptionControllerAdvice;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {
    @Bean
    public FilterRegistrationBean<ExceptionHandlerFilter> exceptionHandlerFilter(ExceptionControllerAdvice exceptionControllerAdvice, ObjectMapper objectMapper) {
        FilterRegistrationBean<ExceptionHandlerFilter> registrationBean = new FilterRegistrationBean<>(new ExceptionHandlerFilter(exceptionControllerAdvice, objectMapper));
        registrationBean.setOrder(Ordered.HIGHEST_PRECEDENCE);
        return registrationBean;
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new OrderKeyConverter());
    }

    private static class OrderKeyConverter implements Converter<String, OrderModel.OrderKey> {

        @Override
        public OrderModel.OrderKey convert(String from) {
            return OrderModel.OrderKey.fromString(from);
        }
    }
}
