package org.bardframework.crud.sample.common.controller;

import org.bardframework.crud.api.base.ReadRestController;
import org.bardframework.crud.sample.common.BaseCriteriaAbstract;
import org.bardframework.crud.sample.common.BaseModelAbstract;
import org.bardframework.crud.sample.common.BaseServiceAbstract;
import org.bardframework.crud.sample.common.User;

public abstract class ReadRestControllerAbstract<M extends BaseModelAbstract, C extends BaseCriteriaAbstract, S extends BaseServiceAbstract<M, C, Object, ?>> extends OperationRestControllerAbstract<M, C, Object, S> implements ReadRestController<M, C, S, String, User> {


}
