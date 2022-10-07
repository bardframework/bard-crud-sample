package org.bardframework.crud.sample.runner.config;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ImportResource("classpath*:*-configuration/**/**.xml")
public class AppConfiguration {

}
