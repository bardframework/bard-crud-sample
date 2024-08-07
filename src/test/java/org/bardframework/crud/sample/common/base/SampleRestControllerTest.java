package org.bardframework.crud.sample.common.base;

import lombok.Getter;
import org.bardframework.crud.api.base.ServiceDataProvider;
import org.springframework.aop.framework.AopProxyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.web.bind.annotation.RequestMapping;

@Getter
public abstract class SampleRestControllerTest<L, P extends ServiceDataProvider<?, ?, ?, ?, ?, I, ?>, I> extends SampleControllerTest {

    @Autowired
    private P dataProvider;
    @Autowired
    private L controller;

    public String BASE_URL() {
        return "/" + AopProxyUtils.ultimateTargetClass(this.getController()).getAnnotation(RequestMapping.class).value()[0];
    }

    public String GET_URL(I id) {
        return BASE_URL() + "/" + id;
    }

    @Override
    public void preExecute(MockHttpServletRequestBuilder request) {
        /*
            Set authentication headers here!
         */
    }
}
