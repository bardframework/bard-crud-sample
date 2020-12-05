package org.bardframework.crud.sample.common.controller;

import org.bardframework.crud.api.base.WriteRestController;
import org.bardframework.crud.sample.common.SampleBaseCriteriaAbstract;
import org.bardframework.crud.sample.common.SampleBaseModelAbstract;
import org.bardframework.crud.sample.common.SampleBaseServiceAbstract;
import org.bardframework.crud.sample.common.SampleUser;

public abstract class SampleWriteRestControllerAbstract<M extends SampleBaseModelAbstract, C extends SampleBaseCriteriaAbstract, D, S extends SampleBaseServiceAbstract<M, C, D, ?>> extends SampleOperationRestControllerAbstract<M, C, D, S> implements WriteRestController<M, D, S, String, SampleUser> {


}
