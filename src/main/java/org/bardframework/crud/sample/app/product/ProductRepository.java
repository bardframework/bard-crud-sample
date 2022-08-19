package org.bardframework.crud.sample.app.product;

import org.bardframework.crud.api.base.BaseRepository;
import org.bardframework.crud.sample.common.SampleUser;

public interface ProductRepository extends BaseRepository<ProductModel, ProductCriteria, Integer, SampleUser> {
}
