package org.bardframework.crud.sample.app.gender;

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
import org.springframework.stereotype.Repository;

import static org.bardframework.crud.sample.common.entity.QTbGender.tbGender;

@Repository
public class GenderRepositoryQdslSqlImpl extends SampleRepositoryQdslSqlAbstract<GenderModel, GenderCriteria, String> implements GenderRepository {

    private static final QBean<GenderModel> Q_BEAN = QueryDslUtils.bean(GenderModel.class,
            tbGender.id,
            tbGender.title,
            tbGender.order
    );

    public GenderRepositoryQdslSqlImpl(SQLQueryFactory queryFactory) {
        super(queryFactory);
    }

    @Override
    protected Predicate getPredicate(GenderCriteria criteria, SampleUser user) {
        BooleanBuilder builder = new BooleanBuilder();
        builder.and(QueryDslUtils.getPredicate(criteria.getSearchQuery(), tbGender.title));
        return builder;
    }

    @Override
    protected RelationalPathBase<?> getEntity() {
        return tbGender;
    }

    @Override
    protected QBean<GenderModel> getSelectExpression() {
        return Q_BEAN;
    }

    @Override
    protected Expression<String> getIdSelectExpression() {
        return tbGender.id;
    }

    @Override
    protected <C extends StoreClause<C>> void onSave(C clause, GenderModel model, SampleUser user) {
        throw new IllegalStateException("not supported");
    }

    @Override
    protected <T extends StoreClause<T>> void onUpdate(T clause, GenderModel model, SampleUser user) {
        throw new IllegalStateException("not supported");
    }

    @Override
    protected String generateId(GenderModel model, SampleUser user) {
        return model.getId();
    }
}
