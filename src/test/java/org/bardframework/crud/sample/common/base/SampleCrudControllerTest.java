package org.bardframework.crud.sample.common.base;

import org.bardframework.crud.api.base.BaseCrudControllerTest;
import org.bardframework.crud.api.base.DataProviderService;

public class SampleCrudControllerTest<CL, P extends DataProviderService<?, ?, ?, ?, ?, String, ?>> extends BaseCrudControllerTest<CL, P, String> implements SampleWebTest {
}
