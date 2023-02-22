package org.bardframework.crud.sample.runner;

import org.bardframework.validator.exception.ValidationExceptionController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionControllerAdvice extends org.bardframework.commons.web.ExceptionControllerAdvice implements ValidationExceptionController {

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public void handle(IllegalArgumentException ex) {
        log.error("illegal argument", ex);
    }
}
