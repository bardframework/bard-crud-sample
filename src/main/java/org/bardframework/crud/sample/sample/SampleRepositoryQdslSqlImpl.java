package org.bardframework.crud.sample.sample;

import com.querydsl.core.dml.StoreClause;
import com.querydsl.core.types.QBean;
import com.querydsl.core.types.dsl.StringPath;
import com.querydsl.sql.RelationalPathBase;
import com.querydsl.sql.SQLQuery;
import org.bardframework.base.crud.BaseRepositoryQdslSqlAbstract;
import org.bardframework.base.utils.QueryDslUtils;
import org.springframework.stereotype.Repository;

import java.util.UUID;

import static org.bardframework.crud.sample.common.entity.QTbSample.tbSample;

@Repository
public class SampleRepositoryQdslSqlImpl extends BaseRepositoryQdslSqlAbstract<SampleModel, SampleCriteria, String, String> {

    private static final QBean<SampleModel> Q_BEAN = QueryDslUtils.bean(SampleModel.class,
            tbSample.id,
            tbSample.email,
            tbSample.displayName,
            tbSample.description
    );

    @Override
    protected <T> SQLQuery<T> setCriteria(SampleCriteria criteria, SQLQuery<T> query, String user) {
        if (null != criteria.getSearchQuery()) {
            query.where(tbSample.displayName.like('%' + criteria.getSearchQuery() + '%'));
        }
        return query;
    }

    @Override
    protected RelationalPathBase<?> getEntity() {
        return tbSample;
    }

    @Override
    protected QBean<SampleModel> getQBean() {
        return Q_BEAN;
    }

    @Override
    protected <C extends StoreClause<C>> C toClause(C clause, SampleModel model, String user) {
        clause.set(tbSample.email, model.getEmail());
        clause.set(tbSample.displayName, model.getDisplayName());
        clause.set(tbSample.description, model.getDescription());
        return clause;
    }

    @Override
    protected SampleModel setIdentifier(SampleModel model, String user) {
        model.setId(UUID.randomUUID().toString());
        return model;
    }

    @Override
    public StringPath getIdentifierPath() {
        return tbSample.id;
    }
}
