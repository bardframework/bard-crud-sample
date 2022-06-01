package org.bardframework.crud.sample.common;

import com.querydsl.sql.SQLQueryFactory;

public abstract class BaseRepositoryQdslSqlAbstract<M extends BaseModelAbstract, C extends BaseCriteriaAbstract> extends org.bardframework.crud.impl.querydsl.base.BaseRepositoryQdslSqlAbstract<M, C, String, User> implements BaseRepository<M, C> {

    public BaseRepositoryQdslSqlAbstract(SQLQueryFactory queryFactory) {
        super(queryFactory);
    }
}
