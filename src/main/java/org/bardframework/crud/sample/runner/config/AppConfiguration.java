package org.bardframework.crud.sample.runner.config;

import org.bardframework.commons.web.WildcardReloadableMessageSource;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.nio.charset.StandardCharsets;

@EnableTransactionManagement
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ImportResource({"classpath*:spring-configuration/**/**.xml", "classpath*:**/**Page.xml"})
public class AppConfiguration {

    @Bean
    public MessageSource messageSource() {
        WildcardReloadableMessageSource messageSource = new WildcardReloadableMessageSource();
        messageSource.addWildcardBaseNames("classpath*:**/i18n/**/**.properties");
        messageSource.addWildcardBaseNames("classpath*:**/i18n*.properties");
        messageSource.setDefaultEncoding(StandardCharsets.UTF_8.displayName());
        messageSource.setCacheSeconds(30);
        messageSource.setConcurrentRefresh(true);
        messageSource.setFallbackToSystemLocale(false);
        return messageSource;
    }
}
