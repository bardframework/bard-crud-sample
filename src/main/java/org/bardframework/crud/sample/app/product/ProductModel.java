package org.bardframework.crud.sample.app.product;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.bardframework.crud.api.base.BaseModelAbstract;

@Getter
@Setter
@ToString
public class ProductModel extends BaseModelAbstract<Integer> {
    private String name;
    private Double price;
}
