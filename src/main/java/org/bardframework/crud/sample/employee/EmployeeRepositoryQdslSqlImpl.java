package org.bardframework.crud.sample.employee;

import com.querydsl.core.dml.StoreClause;
import com.querydsl.core.types.QBean;
import com.querydsl.core.types.dsl.StringPath;
import com.querydsl.sql.RelationalPathBase;
import com.querydsl.sql.SQLQuery;
import org.bardframework.base.utils.QueryDslUtils;
import org.bardframework.crud.sample.common.SampleBaseRepositoryQdslSqlAbstract;
import org.bardframework.crud.sample.common.SampleUser;
import org.springframework.stereotype.Repository;

import java.util.UUID;

import static org.bardframework.crud.sample.common.entity.QTbEmployee.tbEmployee;

@Repository
public class EmployeeRepositoryQdslSqlImpl extends SampleBaseRepositoryQdslSqlAbstract<EmployeeModel, EmployeeCriteria> implements EmployeeRepository {

    private static final QBean<EmployeeModel> Q_BEAN = QueryDslUtils.bean(EmployeeModel.class,
            tbEmployee.id,
            tbEmployee.email,
            tbEmployee.firstName,
            tbEmployee.lastName,
            tbEmployee.description
    );

    @Override
    protected <T> SQLQuery<T> setCriteria(EmployeeCriteria criteria, SQLQuery<T> query, SampleUser user) {
        if (null != criteria.getSearchQuery()) {
            this.buildQuery(query, criteria.getSearchQuery(), tbEmployee.firstName);
        }
        return query;
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
    protected <C extends StoreClause<C>> C toClause(C clause, EmployeeModel model, SampleUser user) {
        clause.set(tbEmployee.email, model.getEmail());
        clause.set(tbEmployee.firstName, model.getFirstName());
        clause.set(tbEmployee.lastName, model.getLastName());
        clause.set(tbEmployee.description, model.getDescription());
        return clause;
    }

    @Override
    protected EmployeeModel setIdentifier(EmployeeModel model, SampleUser user) {
        model.setId(UUID.randomUUID().toString());
        return model;
    }

    @Override
    public StringPath getIdentifierPath() {
        return tbEmployee.id;
    }
}
