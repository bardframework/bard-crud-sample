package org.bardframework.crud.sample.common.base;

import org.bardframework.crud.api.base.DataProviderService;
import org.springframework.aop.framework.AopProxyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.web.bind.annotation.RequestMapping;

public abstract class SampleRestControllerTest<CL, P extends DataProviderService<?, ?, ?, ?, ?, I, ?>, I extends Comparable<? super I>> extends SampleControllerTest {

    @Autowired
    private P dataProvider;
    @Autowired
    private CL controller;

    public P getDataProvider() {
        return dataProvider;
    }

    public CL getController() {
        return controller;
    }

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
