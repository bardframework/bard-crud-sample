package org.bardframework.crud.sample.common.base;

import org.bardframework.crud.api.base.DataProviderService;
import org.springframework.aop.framework.AopProxyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class SampleRestControllerTest<CL, P extends DataProviderService<?, ?, ?, ?, ?, String, ?>> extends SampleControllerTest {

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

    public String GET_URL(String id) {
        return BASE_URL() + "/" + id;
    }
}
