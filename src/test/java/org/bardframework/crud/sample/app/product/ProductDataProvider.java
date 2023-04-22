package org.bardframework.crud.sample.app.product;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.assertj.core.api.Assertions;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.common.base.SampleDataProvider;
import org.springframework.stereotype.Service;

@Service
public class ProductDataProvider extends SampleDataProvider<ProductModel, ProductCriteria, ProductDto, ProductService, ProductRepository, Integer> {

    protected ProductDataProvider(ProductService service) {
        super(service);
    }

    @Override
    public ProductDto getDto() {
        ProductDto dto = new ProductDto();
        dto.setName(RandomStringUtils.randomAlphabetic(1, 10));
        dto.setPrice(RandomUtils.nextInt());
        return dto;
    }

    @Override
    public void assertEqualUpdate(ProductModel model, ProductDto dto) {
        Assertions.assertThat(model.getName()).isEqualTo(dto.getName());
        Assertions.assertThat(model.getPrice()).isEqualByComparingTo(dto.getPrice());
    }

    @Override
    public void makeInvalid(ProductDto dto) {
        dto.setName(null);
    }

    @Override
    public Integer getInvalidId() {
        return Integer.MAX_VALUE;
    }

    @Override
    public void assertEqualUpdate(ProductModel first, ProductModel second) {
        Assertions.assertThat(first.getName()).isEqualTo(second.getName());
        Assertions.assertThat(first.getPrice()).isEqualTo(second.getPrice());
    }

    @Override
    public void makeInvalid(ProductModel model) {
        model.setName(null);
    }

    @Override
    public boolean isDuplicate(ProductModel first, ProductModel second, SampleUser user) {
        return false;
    }
}
