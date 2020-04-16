package org.bardframework.crud.sample;

import org.bardframework.commons.spring.boot.SpringBootRunner;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:develop-configuration/**/**.xml")
@Import(Application.class)
public class DevelopApplication {

    public static void main(String[] args) {
        SpringBootRunner.run(DevelopApplication.class, args);
    }
}
