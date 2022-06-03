package org.bardframework.crud.sample.common.controller;

import org.bardframework.crud.api.base.WriteRestController;
import org.bardframework.crud.sample.common.User;
import org.bardframework.crud.sample.common.base.SampleCriteriaAbstract;
import org.bardframework.crud.sample.common.base.SampleModelAbstract;
import org.bardframework.crud.sample.common.base.SampleServiceAbstract;

public abstract class WriteRestControllerAbstract<M extends SampleModelAbstract, C extends SampleCriteriaAbstract, D, S extends SampleServiceAbstract<M, C, D, ?>> extends OperationRestControllerAbstract<M, C, D, S> implements WriteRestController<M, D, S, String, User> {

}
