package org.bardframework.crud.sample.common.controller;

import org.bardframework.crud.api.base.ReadRestController;
import org.bardframework.crud.sample.common.SampleBaseCriteriaAbstract;
import org.bardframework.crud.sample.common.SampleBaseModelAbstract;
import org.bardframework.crud.sample.common.SampleBaseServiceAbstract;
import org.bardframework.crud.sample.common.SampleUser;

public abstract class SampleReadRestControllerAbstract<M extends SampleBaseModelAbstract, C extends SampleBaseCriteriaAbstract, S extends SampleBaseServiceAbstract<M, C, Object, ?>> extends SampleOperationRestControllerAbstract<M, C, Object, S> implements ReadRestController<M, C, S, String, SampleUser> {


}
