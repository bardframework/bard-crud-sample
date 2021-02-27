package org.bardframework.crud.sample.common;

import org.bardframework.crud.sample.runner.Application;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"dev", "test"})
@Import({Application.class})
public class WebTestConfiguration {

}
