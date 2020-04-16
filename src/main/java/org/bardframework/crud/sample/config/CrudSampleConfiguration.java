package org.bardframework.crud.sample.config;

import org.bardframework.commons.config.Configurator;
import org.bardframework.commons.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

import java.util.List;

@Configuration
public class CrudSampleConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired(required = false)
    private List<Configurator> configurators;

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
