package org.bardframework.crud.sample.gender;

import org.bardframework.crud.sample.common.SampleBaseModelAbstract;

public class GenderModel extends SampleBaseModelAbstract {
    private String title;
    private int order;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
