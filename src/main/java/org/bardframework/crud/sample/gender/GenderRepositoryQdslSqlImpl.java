package org.bardframework.crud.sample.gender;

import com.querydsl.core.dml.StoreClause;
import com.querydsl.core.types.QBean;
import com.querydsl.core.types.dsl.StringPath;
import com.querydsl.sql.RelationalPathBase;
import com.querydsl.sql.SQLQuery;
import org.bardframework.base.utils.QueryDslUtils;
import org.bardframework.crud.sample.common.SampleBaseRepositoryQdslSqlAbstract;
import org.bardframework.crud.sample.common.SampleUser;
import org.springframework.stereotype.Repository;

import static org.bardframework.crud.sample.common.entity.QTbGender.tbGender;

@Repository
public class GenderRepositoryQdslSqlImpl extends SampleBaseRepositoryQdslSqlAbstract<GenderModel, GenderCriteria> implements GenderRepository {

    private static final QBean<GenderModel> Q_BEAN = QueryDslUtils.bean(GenderModel.class,
            tbGender.id,
            tbGender.title,
            tbGender.order
    );

    @Override
    protected <T> SQLQuery<T> setCriteria(GenderCriteria criteria, SQLQuery<T> query, SampleUser user) {
        if (null != criteria.getSearchQuery()) {
            query.where(tbGender.title.like('%' + criteria.getSearchQuery() + '%'));
        }
        return query;
    }

    @Override
    protected RelationalPathBase<?> getEntity() {
        return tbGender;
    }

    @Override
    protected QBean<GenderModel> getQBean() {
        return Q_BEAN;
    }

    @Override
    protected <C extends StoreClause<C>> C toClause(C clause, GenderModel model, SampleUser user) {
        throw new IllegalStateException("not supported");

    }

    @Override
    protected GenderModel setIdentifier(GenderModel model, SampleUser user) {
        throw new IllegalStateException("not supported");
    }

    @Override
    public StringPath getIdentifierPath() {
        return tbGender.id;
    }
}
