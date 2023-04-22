package org.bardframework.crud.sample.app.order;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderDto {
    private String customerId;
    private Integer productId;
    private int count;
}
