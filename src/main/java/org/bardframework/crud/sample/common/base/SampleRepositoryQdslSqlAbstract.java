package org.bardframework.crud.sample.common.base;

import com.querydsl.sql.SQLQueryFactory;
import org.bardframework.crud.impl.querydsl.base.BaseRepositoryQdslSqlAbstract;
import org.bardframework.crud.sample.common.User;

public abstract class SampleRepositoryQdslSqlAbstract<M extends SampleModelAbstract, C extends SampleCriteriaAbstract> extends BaseRepositoryQdslSqlAbstract<M, C, String, User> implements SampleRepository<M, C> {

    public SampleRepositoryQdslSqlAbstract(SQLQueryFactory queryFactory) {
        super(queryFactory);
    }
}
