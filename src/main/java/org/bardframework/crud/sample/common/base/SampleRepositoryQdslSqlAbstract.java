package org.bardframework.crud.sample.common.base;

import com.querydsl.sql.SQLQueryFactory;
import org.bardframework.crud.api.base.BaseCriteria;
import org.bardframework.crud.api.base.BaseModel;
import org.bardframework.crud.impl.querydsl.base.BaseRepositoryQdslSqlAbstract;
import org.bardframework.crud.sample.common.SampleUser;

public abstract class SampleRepositoryQdslSqlAbstract<M extends BaseModel<I>, C extends BaseCriteria<I>, I extends Comparable<? super I>> extends BaseRepositoryQdslSqlAbstract<M, C, I, SampleUser> implements SampleRepository<M, C, I> {

    public SampleRepositoryQdslSqlAbstract(SQLQueryFactory queryFactory) {
        super(queryFactory);
    }
}
