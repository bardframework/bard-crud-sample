package org.bardframework.crud.sample.runner.config;

import com.querydsl.sql.Configuration;
import com.querydsl.sql.SQLQueryFactory;
import com.querydsl.sql.SQLTemplates;
import com.querydsl.sql.spring.SpringConnectionProvider;
import com.querydsl.sql.types.JSR310LocalDateTimeType;
import com.querydsl.sql.types.JSR310LocalDateType;
import com.querydsl.sql.types.JSR310LocalTimeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.function.Supplier;

public class QueryDslConfiguration {

    @Bean
    public SQLQueryFactory queryFactory(@Autowired DataSource dataSource, @Autowired SQLTemplates sqlTemplates) {
        Configuration configuration = new Configuration(sqlTemplates);
        configuration.register(new JSR310LocalDateTimeType());
        configuration.register(new JSR310LocalDateType());
        configuration.register(new JSR310LocalTimeType());
        Supplier<Connection> provider = new SpringConnectionProvider(dataSource);
        return new SQLQueryFactory(configuration, provider);
    }
}
