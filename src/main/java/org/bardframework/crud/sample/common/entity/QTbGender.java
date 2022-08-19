package org.bardframework.crud.sample.common.entity;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.StringPath;
import com.querydsl.sql.ColumnMetadata;

import javax.annotation.processing.Generated;
import java.sql.Types;
import java.util.Arrays;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;


/**
 * QTbGender is a Querydsl query type for QTbGender
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTbGender extends com.querydsl.sql.RelationalPathBase<QTbGender> {

    public static final QTbGender tbGender = new QTbGender("tb_gender");
    private static final long serialVersionUID = 1715339385;
    public final StringPath id = createString("id");

    public final NumberPath<Integer> order = createNumber("order", Integer.class);

    public final StringPath title = createString("title");

    public final com.querydsl.sql.PrimaryKey<QTbGender> primary = createPrimaryKey(id);

    public final com.querydsl.sql.ForeignKey<QTbCustomer> _tbCustomerFkGender = createInvForeignKey(Arrays.asList(id, id), Arrays.asList("gender_id", "gender_id"));

    public QTbGender(String variable) {
        super(QTbGender.class, forVariable(variable), "null", "tb_gender");
        addMetadata();
    }

    public QTbGender(String variable, String schema, String table) {
        super(QTbGender.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTbGender(String variable, String schema) {
        super(QTbGender.class, forVariable(variable), schema, "tb_gender");
        addMetadata();
    }

    public QTbGender(Path<? extends QTbGender> path) {
        super(path.getType(), path.getMetadata(), "null", "tb_gender");
        addMetadata();
    }

    public QTbGender(PathMetadata metadata) {
        super(QTbGender.class, metadata, "null", "tb_gender");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.CHAR).withSize(50).notNull());
        addMetadata(order, ColumnMetadata.named("order").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(title, ColumnMetadata.named("title").withIndex(2).ofType(Types.CHAR).withSize(100).notNull());
    }

}

