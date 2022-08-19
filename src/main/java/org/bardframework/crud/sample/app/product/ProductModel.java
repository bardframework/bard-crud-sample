package org.bardframework.crud.sample.app.product;

import org.bardframework.crud.api.base.BaseModelAbstract;

public class ProductModel extends BaseModelAbstract<Integer> {
    private String name;
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
