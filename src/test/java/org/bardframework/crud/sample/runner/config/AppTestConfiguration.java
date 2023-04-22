package org.bardframework.crud.sample.runner.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;
import java.nio.file.Path;

public class AppTestConfiguration {

    @Bean
    PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    @Profile("h2Db")
    @Bean
    DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .setName("sample;DB_CLOSE_DELAY=-1;MODE=MYSQL;NON_KEYWORDS=value,key;IGNORECASE=TRUE")
                .addScript(Path.of(System.getProperty("user.dir")).resolve("src/assembly/database/schema-h2.sql").toFile().toURI().toString())
                .build();
    }
}
