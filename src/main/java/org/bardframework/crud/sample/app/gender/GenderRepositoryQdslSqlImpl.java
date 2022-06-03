package org.bardframework.crud.sample.app.gender;

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

import static org.bardframework.crud.sample.common.entity.QTbGender.tbGender;

@Repository
public class GenderRepositoryQdslSqlImpl extends SampleRepositoryQdslSqlAbstract<GenderModel, GenderCriteria> implements GenderRepository {

    private static final QBean<GenderModel> Q_BEAN = QueryDslUtils.bean(GenderModel.class,
            tbGender.id,
            tbGender.title,
            tbGender.order
    );

    public GenderRepositoryQdslSqlImpl(SQLQueryFactory queryFactory) {
        super(queryFactory);
    }

    @Override
    protected void setCriteria(GenderCriteria criteria, SQLQuery<?> query, User user) {
        if (null != criteria.getSearchQuery()) {
            query.where(tbGender.title.like('%' + criteria.getSearchQuery() + '%'));
        }
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
    protected void setIdentifier(GenderModel model, User user) {
        throw new IllegalStateException("not supported");
    }

    @Override
    public StringPath getIdentifierPath() {
        return tbGender.id;
    }
}
