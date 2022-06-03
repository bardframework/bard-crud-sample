package org.bardframework.crud.sample.app.employee;

import com.querydsl.core.dml.StoreClause;
import com.querydsl.core.types.QBean;
import com.querydsl.core.types.dsl.StringPath;
import com.querydsl.sql.RelationalPathBase;
import com.querydsl.sql.SQLQuery;
import com.querydsl.sql.SQLQueryFactory;
import org.bardframework.crud.impl.querydsl.utils.QueryDslUtils;
import org.bardframework.crud.sample.common.User;
import org.bardframework.crud.sample.common.base.SampleRepositoryQdslSqlAbstract;
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
    protected void setCriteria(EmployeeCriteria criteria, SQLQuery<?> query, User user) {
        if (null != criteria.getSearchQuery()) {
            query.where(QueryDslUtils.buildQuery(criteria.getSearchQuery(), tbEmployee.firstName));
        }
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
    protected <C extends StoreClause<C>> C toClause(C clause, EmployeeModel model, User user) {
        clause.set(tbEmployee.email, model.getEmail());
        clause.set(tbEmployee.firstName, model.getFirstName());
        clause.set(tbEmployee.lastName, model.getLastName());
        clause.set(tbEmployee.description, model.getDescription());
        return clause;
    }

    @Override
    protected void setIdentifier(EmployeeModel model, User user) {
        model.setId(UUID.randomUUID().toString());
    }

    @Override
    public StringPath getIdentifierPath() {
        return tbEmployee.id;
    }
}
