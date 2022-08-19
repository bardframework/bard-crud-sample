package org.bardframework.crud.sample.app.product;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.dml.StoreClause;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.QBean;
import com.querydsl.sql.RelationalPathBase;
import com.querydsl.sql.SQLQueryFactory;
import org.bardframework.crud.impl.querydsl.base.BaseRepositoryQdslSqlAbstract;
import org.bardframework.crud.impl.querydsl.utils.QueryDslUtils;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.form.model.filter.IdFilter;
import org.springframework.stereotype.Repository;

import static org.bardframework.crud.sample.common.entity.QTbProduct.tbProduct;

@Repository
public class ProductRepositoryQdslSqlImpl extends BaseRepositoryQdslSqlAbstract<ProductModel, ProductCriteria, Integer, SampleUser> implements ProductRepository {

    private static final QBean<ProductModel> Q_BEAN = QueryDslUtils.bean(ProductModel.class,
            tbProduct.id,
            tbProduct.name,
            tbProduct.price
    );

    public ProductRepositoryQdslSqlImpl(SQLQueryFactory queryFactory) {
        super(queryFactory);
    }

    @Override
    protected Predicate getPredicate(ProductCriteria criteria, SampleUser user) {
        BooleanBuilder builder = new BooleanBuilder();
        builder.orAllOf(QueryDslUtils.getPredicate(criteria.getPriceFilter(), tbProduct.price));
        return builder;
    }

    @Override
    protected Predicate getPredicate(IdFilter<Integer> idFilter, SampleUser user) {
        return QueryDslUtils.getPredicate(idFilter, tbProduct.id);
    }

    @Override
    protected RelationalPathBase<?> getEntity() {
        return tbProduct;
    }

    @Override
    protected QBean<ProductModel> getQBean() {
        return Q_BEAN;
    }

    @Override
    protected Expression<Integer> getIdPath() {
        return tbProduct.id;
    }

    @Override
    protected <C extends StoreClause<C>> void onSave(C clause, ProductModel model, SampleUser user) {
        clause.set(tbProduct.id, model.getId());
        this.onUpdate(clause, model, user);
    }

    @Override
    protected <T extends StoreClause<T>> void onUpdate(T clause, ProductModel model, SampleUser user) {
        clause.set(tbProduct.name, model.getName());
        clause.set(tbProduct.price, model.getPrice());
    }

    @Override
    protected Integer generateId(ProductModel model, SampleUser user) {
        return null;
    }
}
