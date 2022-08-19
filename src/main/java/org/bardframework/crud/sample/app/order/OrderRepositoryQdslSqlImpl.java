package org.bardframework.crud.sample.app.order;

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

import static org.bardframework.crud.sample.common.entity.QTbOrder.tbOrder;

@Repository
public class OrderRepositoryQdslSqlImpl extends BaseRepositoryQdslSqlAbstract<OrderModel, OrderCriteria, OrderModel.OrderKey, SampleUser> implements OrderRepository {

    private static final QBean<OrderModel.OrderKey> Q_BEAN_ID = QueryDslUtils.bean(OrderModel.OrderKey.class, tbOrder.customerId, tbOrder.productId);
    private static final QBean<OrderModel> Q_BEAN = QueryDslUtils.bean(OrderModel.class, Q_BEAN_ID.as("id"), tbOrder.count);

    public OrderRepositoryQdslSqlImpl(SQLQueryFactory queryFactory) {
        super(queryFactory);
    }

    @Override
    protected Predicate getPredicate(OrderCriteria criteria, SampleUser user) {
        BooleanBuilder builder = new BooleanBuilder();
        builder.and(QueryDslUtils.getPredicate(criteria.getCustomerIdFilter(), tbOrder.customerId));
        builder.and(QueryDslUtils.getPredicate(criteria.getProductIdFilter(), tbOrder.productId));
        return builder;
    }

    @Override
    protected Predicate getPredicate(IdFilter<OrderModel.OrderKey> idFilter, SampleUser user) {
        return QueryDslUtils.getPredicate(idFilter,
                orderKey -> tbOrder.productId.eq(orderKey.getProductId()).and(tbOrder.customerId.eq(orderKey.getCustomerId())),
                () -> tbOrder.productId.isNotNull().and(tbOrder.customerId.isNotNull()),
                () -> tbOrder.productId.isNull().and(tbOrder.customerId.isNull())
        );
    }

    @Override
    protected RelationalPathBase<?> getEntity() {
        return tbOrder;
    }

    @Override
    protected QBean<OrderModel> getQBean() {
        return Q_BEAN;
    }

    @Override
    protected Expression<OrderModel.OrderKey> getIdPath() {
        return Q_BEAN_ID;
    }

    @Override
    protected <C extends StoreClause<C>> void onSave(C clause, OrderModel model, SampleUser user) {
        clause.set(tbOrder.customerId, model.getId().getCustomerId());
        clause.set(tbOrder.productId, model.getId().getProductId());
        this.onUpdate(clause, model, user);
    }

    @Override
    protected <T extends StoreClause<T>> void onUpdate(T clause, OrderModel model, SampleUser user) {
        clause.set(tbOrder.count, model.getCount());
    }

    @Override
    protected OrderModel.OrderKey generateId(OrderModel model, SampleUser user) {
        return model.getId();
    }
}
