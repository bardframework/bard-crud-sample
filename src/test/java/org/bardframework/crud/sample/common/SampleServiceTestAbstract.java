package org.bardframework.crud.sample.common;

import org.bardframework.crud.api.base.ServiceTestAbstract;
import org.bardframework.crud.sample.config.JdbcConfiguration;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.bind.annotation.RestController;

@ExtendWith(SpringExtension.class)
@ComponentScan(basePackages = {"org.bardframework.crud.sample"}, excludeFilters = {@ComponentScan.Filter(value = {Configuration.class, RestController.class})})
@Import({JdbcConfiguration.class})
@TestPropertySource({"classpath:test.properties", "classpath:develop-configuration/database-config.properties"})
@ContextConfiguration(locations = {"classpath:develop-configuration/**/**.xml", "classpath*:test-configuration.xml"})
public abstract class SampleServiceTestAbstract<M extends SampleBaseModelAbstract, C extends SampleBaseCriteriaAbstract, D, S extends SampleBaseServiceAbstract<M, C, D, ?>, P extends SampleDataProviderServiceAbstract<M, C, D, S, ?>> extends ServiceTestAbstract<M, C, D, S, P, String, SampleUser> {

    @Override
    protected SampleUser getUser() {
        return DataProviderUtils.getUser();
    }
}
