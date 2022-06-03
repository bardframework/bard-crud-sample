package org.bardframework.crud.sample.common.base;

import org.bardframework.crud.api.base.DataProviderService;
import org.bardframework.crud.api.base.RestControllerTest;

public class SampleRestControllerTest<CL, P extends DataProviderService<?, ?, ?, ?, ?, String, ?>> extends RestControllerTest<CL, P, String> implements SampleWebTest {
}
