package org.bardframework.crud.sample.app.customer;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomerDto {
    private String email;
    private String firstName;
    private String lastName;
    private String description;
}
