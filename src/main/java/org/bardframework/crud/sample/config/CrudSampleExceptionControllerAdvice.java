package org.bardframework.crud.sample.config;

import org.bardframework.commons.web.ExceptionControllerAdvice;
import org.bardframework.validator.exception.ValidationExceptionController;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class CrudSampleExceptionControllerAdvice extends ExceptionControllerAdvice implements ValidationExceptionController {
}
