package org.bardframework.crud.sample.app.product;

import org.bardframework.crud.api.base.ReadRestController;
import org.bardframework.crud.api.base.WriteRestController;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.common.base.SampleControllerAbstract;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "product", produces = APPLICATION_JSON_VALUE)
public class ProductRestController extends SampleControllerAbstract implements
        ReadRestController<ProductModel, ProductCriteria, ProductService, Integer, SampleUser>,
        WriteRestController<ProductModel, ProductDto, ProductService, Integer, SampleUser> {

    protected final ProductService service;

    public ProductRestController(ProductService service) {
        this.service = service;
    }

    @Override
    public ProductService getService() {
        return service;
    }
}
