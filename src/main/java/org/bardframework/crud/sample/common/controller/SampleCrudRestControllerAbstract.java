package org.bardframework.crud.sample.common.controller;

import org.bardframework.base.crud.ReadRestController;
import org.bardframework.base.crud.WriteRestController;
import org.bardframework.crud.sample.common.SampleBaseCriteriaAbstract;
import org.bardframework.crud.sample.common.SampleBaseModelAbstract;
import org.bardframework.crud.sample.common.SampleBaseServiceAbstract;
import org.bardframework.crud.sample.common.SampleUser;

public abstract class SampleCrudRestControllerAbstract<M extends SampleBaseModelAbstract, C extends SampleBaseCriteriaAbstract, D, S extends SampleBaseServiceAbstract<M, C, D, ?>> extends SampleOperationRestControllerAbstract<M, C, D, S> implements ReadRestController<M, C, S, String, SampleUser>, WriteRestController<M, D, S, String, SampleUser> {

}
