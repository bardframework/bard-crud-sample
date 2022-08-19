package org.bardframework.crud.sample.app.employee;

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
import org.bardframework.form.model.filter.IdFilter;
import org.springframework.stereotype.Repository;

import java.util.UUID;

import static org.bardframework.crud.sample.common.entity.QTbEmployee.tbEmployee;

@Repository
public class EmployeeRepositoryQdslSqlImpl extends SampleRepositoryQdslSqlAbstract<EmployeeModel, EmployeeCriteria> implements EmployeeRepository {

    private static final QBean<EmployeeModel> Q_BEAN = QueryDslUtils.bean(EmployeeModel.class,
            tbEmployee.id,
            tbEmployee.email,
            tbEmployee.firstName,
            tbEmployee.lastName,
            tbEmployee.description
    );

    public EmployeeRepositoryQdslSqlImpl(SQLQueryFactory queryFactory) {
        super(queryFactory);
    }

    @Override
    protected Predicate getPredicate(EmployeeCriteria criteria, SampleUser user) {
        BooleanBuilder builder = new BooleanBuilder();
        builder.orAllOf(QueryDslUtils.getPredicate(criteria.getSearchQuery(), tbEmployee.firstName), QueryDslUtils.getPredicate(criteria.getSearchQuery(), tbEmployee.lastName));
        return builder;
    }

    @Override
    protected Predicate getPredicate(IdFilter<String> idFilter, SampleUser user) {
        return QueryDslUtils.getPredicate(idFilter, tbEmployee.id);
    }

    @Override
    protected RelationalPathBase<?> getEntity() {
        return tbEmployee;
    }

    @Override
    protected QBean<EmployeeModel> getQBean() {
        return Q_BEAN;
    }

    @Override
    protected Expression<String> getIdPath() {
        return tbEmployee.id;
    }

    @Override
    protected <C extends StoreClause<C>> void onSave(C clause, EmployeeModel model, SampleUser user) {
        clause.set(tbEmployee.id, model.getId());
        this.onUpdate(clause, model, user);
    }

    @Override
    protected <T extends StoreClause<T>> void onUpdate(T clause, EmployeeModel model, SampleUser user) {
        clause.set(tbEmployee.email, model.getEmail());
        clause.set(tbEmployee.firstName, model.getFirstName());
        clause.set(tbEmployee.lastName, model.getLastName());
        clause.set(tbEmployee.description, model.getDescription());
    }

    @Override
    protected String generateId(EmployeeModel model, SampleUser user) {
        return UUID.randomUUID().toString();
    }
}
