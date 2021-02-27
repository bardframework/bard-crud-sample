package org.bardframework.crud.sample.app.gender;

import com.querydsl.core.dml.StoreClause;
import com.querydsl.core.types.QBean;
import com.querydsl.core.types.dsl.StringPath;
import com.querydsl.sql.RelationalPathBase;
import com.querydsl.sql.SQLQuery;
import org.bardframework.crud.impl.querydsl.utils.QueryDslUtils;
import org.bardframework.crud.sample.common.BaseRepositoryQdslSqlAbstract;
import org.bardframework.crud.sample.common.User;
import org.springframework.stereotype.Repository;

import static org.bardframework.crud.sample.common.entity.QTbGender.tbGender;

@Repository
public class GenderRepositoryQdslSqlImpl extends BaseRepositoryQdslSqlAbstract<GenderModel, GenderCriteria> implements GenderRepository {

    private static final QBean<GenderModel> Q_BEAN = QueryDslUtils.bean(GenderModel.class,
            tbGender.id,
            tbGender.title,
            tbGender.order
    );

    @Override
    protected <T> SQLQuery<T> setCriteria(GenderCriteria criteria, SQLQuery<T> query, User user) {
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
    protected <C extends StoreClause<C>> C toClause(C clause, GenderModel model, User user) {
        throw new IllegalStateException("not supported");

    }

    @Override
    protected GenderModel setIdentifier(GenderModel model, User user) {
        throw new IllegalStateException("not supported");
    }

    @Override
    public StringPath getIdentifierPath() {
        return tbGender.id;
    }
}
