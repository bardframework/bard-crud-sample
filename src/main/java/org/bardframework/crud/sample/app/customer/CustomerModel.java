package org.bardframework.crud.sample.app.customer;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.bardframework.crud.api.base.BaseModelAbstract;

@Getter
@Setter
@ToString
public class CustomerModel extends BaseModelAbstract<String> {
    private String email;
    private String firstName;
    private String lastName;
    private String description;
}
