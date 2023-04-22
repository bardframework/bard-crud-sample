package org.bardframework.crud.sample.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class SampleUser {
    private final String userId;
    private final String username;
}
