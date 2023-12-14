package org.bardframework.crud.sample.runner.config;

import lombok.extern.slf4j.Slf4j;
import org.bardframework.commons.web.BaseExceptionControllerAdvice;
import org.bardframework.validator.exception.ValidationExceptionControllerAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@Slf4j
public class SampleExceptionControllerAdvice implements BaseExceptionControllerAdvice, ValidationExceptionControllerAdvice {

    @Autowired
    protected MessageSource messageSource;

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public void handle(IllegalArgumentException ex) {
        log.error("illegal argument", ex);
    }

    @Override
    public MessageSource getMessageSource() {
        return messageSource;
    }
}
