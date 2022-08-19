package org.bardframework.crud.sample.app.product;

import com.fasterxml.jackson.core.type.TypeReference;
import org.bardframework.crud.api.base.PagedData;
import org.bardframework.crud.api.base.ReadRestControllerTest;
import org.bardframework.crud.api.base.WriteRestControllerTest;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.common.base.SampleRestControllerTest;

class ProductRestControllerTest extends SampleRestControllerTest<ProductRestController, ProductDataProvider, Integer> implements
        ReadRestControllerTest<ProductModel, ProductCriteria, ProductDataProvider, Integer, SampleUser>,
        WriteRestControllerTest<ProductModel, ProductDto, ProductDataProvider, Integer, SampleUser> {

    @Override
    public TypeReference<ProductModel> getModelTypeReference() {
        return new TypeReference<ProductModel>() {
        };
    }

    @Override
    public TypeReference<? extends PagedData<ProductModel>> getDataModelTypeReference() {
        return new TypeReference<PagedData<ProductModel>>() {
        };
    }
}
