package org.bardframework.crud.sample.app.product;

import com.fasterxml.jackson.databind.JavaType;
import org.bardframework.crud.api.base.ReadRestControllerTest;
import org.bardframework.crud.api.base.WriteRestControllerTest;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.common.base.SampleRestControllerTest;

class ProductRestControllerTest extends SampleRestControllerTest<ProductRestController, ProductDataProvider, Integer> implements
        ReadRestControllerTest<ProductModel, ProductCriteria, ProductDataProvider, Integer, SampleUser>,
        WriteRestControllerTest<ProductModel, ProductDto, ProductDataProvider, Integer, SampleUser> {

    @Override
    public Class<ProductModel> getModelClass() {
        return ProductModel.class;
    }

    @Override
    public JavaType getModelJavaType() {
        return ReadRestControllerTest.super.getModelJavaType();
    }
}
