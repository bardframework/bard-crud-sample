package org.bardframework.crud.sample.app.customer;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.dml.StoreClause;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.QBean;
import com.querydsl.sql.RelationalPathBase;
import com.querydsl.sql.SQLQueryFactory;
import org.bardframework.crud.impl.querydsl.utils.QueryDslUtils;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.common.base.SampleRepositoryQdslSqlAbstract;
import org.springframework.stereotype.Repository;

import java.util.UUID;

import static org.bardframework.crud.sample.common.entity.QTbCustomer.tbCustomer;

@Repository
public class CustomerRepositoryQdslSqlImpl extends SampleRepositoryQdslSqlAbstract<CustomerModel, CustomerCriteria, String> implements CustomerRepository {

    private static final QBean<CustomerModel> Q_BEAN = QueryDslUtils.bean(CustomerModel.class,
            tbCustomer.id,
            tbCustomer.email,
            tbCustomer.firstName,
            tbCustomer.lastName,
            tbCustomer.description
    );

    public CustomerRepositoryQdslSqlImpl(SQLQueryFactory queryFactory) {
        super(queryFactory);
    }

    @Override
    protected Predicate getPredicate(CustomerCriteria criteria, SampleUser user) {
        BooleanBuilder builder = new BooleanBuilder();
        builder.orAllOf(QueryDslUtils.getPredicate(criteria.getSearchFilter(), tbCustomer.firstName), QueryDslUtils.getPredicate(criteria.getSearchFilter(), tbCustomer.lastName));
        return builder;
    }

    @Override
    protected RelationalPathBase<?> getEntity() {
        return tbCustomer;
    }

    @Override
    protected QBean<CustomerModel> getSelectExpression() {
        return Q_BEAN;
    }

    @Override
    protected Expression<String> getIdSelectExpression() {
        return tbCustomer.id;
    }

    @Override
    protected <C extends StoreClause<C>> void onSave(C clause, CustomerModel model, SampleUser user) {
        clause.set(tbCustomer.id, model.getId());
        this.onUpdate(clause, model, user);
    }

    @Override
    protected <T extends StoreClause<T>> void onUpdate(T clause, CustomerModel model, SampleUser user) {
        clause.set(tbCustomer.email, model.getEmail());
        clause.set(tbCustomer.firstName, model.getFirstName());
        clause.set(tbCustomer.lastName, model.getLastName());
        clause.set(tbCustomer.description, model.getDescription());
    }

    @Override
    protected String generateId(CustomerModel model, SampleUser user) {
        return UUID.randomUUID().toString();
    }
}
