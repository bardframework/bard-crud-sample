package org.bardframework.crud.sample.app.product;

import org.bardframework.crud.api.base.ReadRestController;
import org.bardframework.crud.api.base.WriteRestController;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.common.base.SampleRestControllerAbstract;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "product", produces = APPLICATION_JSON_VALUE)
public class ProductRestController extends SampleRestControllerAbstract<ProductService, Integer> implements
        ReadRestController<ProductModel, ProductCriteria, ProductService, Integer, SampleUser>,
        WriteRestController<ProductModel, ProductDto, ProductService, Integer, SampleUser> {

    protected ProductRestController(ProductService service) {
        super(service);
    }
}
