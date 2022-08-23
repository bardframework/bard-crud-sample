package org.bardframework.crud.sample.runner.config;

import com.querydsl.sql.SQLQueryFactory;
import com.querydsl.sql.SQLTemplates;
import com.querydsl.sql.types.JSR310LocalDateTimeType;
import com.querydsl.sql.types.JSR310LocalDateType;
import com.querydsl.sql.types.JSR310LocalTimeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class QueryDslConfiguration {

    private com.querydsl.sql.Configuration querydslConfiguration(@Autowired SQLTemplates templates) {
        com.querydsl.sql.Configuration configuration = new com.querydsl.sql.Configuration(templates);
        configuration.register(new JSR310LocalDateTimeType());
        configuration.register(new JSR310LocalDateType());
        configuration.register(new JSR310LocalTimeType());
        return configuration;
    }

    @Bean
    public SQLQueryFactory queryFactory(@Autowired DataSource dataSource, @Autowired SQLTemplates templates) {
        return new SQLQueryFactory(querydslConfiguration(templates), dataSource);
    }
}
