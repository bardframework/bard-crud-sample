package org.bardframework.crud.sample.app.product;

import org.bardframework.crud.api.base.BaseService;
import org.bardframework.crud.sample.common.SampleUser;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends BaseService<ProductModel, ProductCriteria, ProductDto, ProductRepository, Integer, SampleUser> {

    public ProductService(ProductRepository repository) {
        super(repository);
    }

    @Override
    protected ProductModel onSave(ProductDto dto, SampleUser user) {
        ProductModel model = new ProductModel();
        model.setName(dto.getName());
        model.setPrice(dto.getPrice());
        return model;
    }

    @Override
    protected void onUpdate(ProductDto dto, ProductModel model, SampleUser user) {
        model.setName(dto.getName());
        model.setPrice(dto.getPrice());
    }
}
