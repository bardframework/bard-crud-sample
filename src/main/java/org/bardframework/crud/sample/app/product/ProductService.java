package org.bardframework.crud.sample.app.product;

import org.bardframework.commons.utils.AssertionUtils;
import org.bardframework.crud.api.base.BaseService;
import org.bardframework.crud.sample.common.SampleUser;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends BaseService<ProductModel, ProductCriteria, ProductDto, ProductRepository, Integer, SampleUser> {

    public ProductService(ProductRepository repository) {
        super(repository);
    }

    @Override
    protected void preSave(ProductDto dto, SampleUser user) {
        AssertionUtils.hasText(dto.getName(), "empty name not acceptable");
    }

    @Override
    protected ProductModel onSave(ProductDto dto, SampleUser user) {
        ProductModel entity = new ProductModel();
        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());
        return entity;
    }

    @Override
    protected void preUpdate(ProductModel previousModel, ProductDto dto, SampleUser user) {
        AssertionUtils.hasText(dto.getName(), "empty name not acceptable");
    }

    @Override
    protected void onUpdate(ProductDto dto, ProductModel entity, SampleUser user) {
        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());
    }
}
