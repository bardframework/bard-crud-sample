package org.bardframework.crud.sample.app.customer;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.bardframework.crud.api.base.BaseCriteriaAbstract;
import org.bardframework.form.model.filter.StringFilter;

@Getter
@Setter
@ToString
public class CustomerCriteria extends BaseCriteriaAbstract<String> {

    private StringFilter searchFilter;

}
