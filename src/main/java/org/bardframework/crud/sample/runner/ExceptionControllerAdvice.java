package org.bardframework.crud.sample.runner;

import org.bardframework.validator.exception.ValidationExceptionController;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionControllerAdvice extends org.bardframework.commons.web.ExceptionControllerAdvice implements ValidationExceptionController {
}
