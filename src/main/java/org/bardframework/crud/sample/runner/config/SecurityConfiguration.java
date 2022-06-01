package org.bardframework.crud.sample.runner.config;

import org.apache.commons.collections4.CollectionUtils;
import org.bardframework.commons.security.SecurityConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

import java.util.List;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired(required = false)
    private List<SecurityConfigurer> configurators;

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.httpBasic().disable().formLogin().disable().logout().disable().csrf().disable();
        httpSecurity.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        if (CollectionUtils.isNotEmpty(configurators)) {
            this.configurators.forEach(configurator -> configurator.configure(httpSecurity));
        }
        httpSecurity.authorizeRequests().anyRequest().permitAll();
    }
}
