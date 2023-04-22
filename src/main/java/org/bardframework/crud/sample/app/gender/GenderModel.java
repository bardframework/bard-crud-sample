package org.bardframework.crud.sample.app.gender;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.bardframework.crud.api.base.BaseModelAbstract;

@Getter
@Setter
@ToString
public class GenderModel extends BaseModelAbstract<String> {
    private String title;
    private int order;
}
