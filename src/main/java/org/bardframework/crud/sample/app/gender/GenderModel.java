package org.bardframework.crud.sample.app.gender;

import org.bardframework.crud.api.base.BaseModelAbstract;

public class GenderModel extends BaseModelAbstract<String> {
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
