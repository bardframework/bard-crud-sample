package org.bardframework.crud.sample.common.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTbSample is a Querydsl query type for QTbSample
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTbSample extends com.querydsl.sql.RelationalPathBase<QTbSample> {

    private static final long serialVersionUID = 2055177058;

    public static final QTbSample tbSample = new QTbSample("tb_sample");

    public final StringPath description = createString("description");

    public final StringPath displayName = createString("displayName");

    public final StringPath email = createString("email");

    public final StringPath id = createString("id");

    public QTbSample(String variable) {
        super(QTbSample.class, forVariable(variable), "null", "tb_sample");
        addMetadata();
    }

    public QTbSample(String variable, String schema, String table) {
        super(QTbSample.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTbSample(String variable, String schema) {
        super(QTbSample.class, forVariable(variable), schema, "tb_sample");
        addMetadata();
    }

    public QTbSample(Path<? extends QTbSample> path) {
        super(path.getType(), path.getMetadata(), "null", "tb_sample");
        addMetadata();
    }

    public QTbSample(PathMetadata metadata) {
        super(QTbSample.class, metadata, "null", "tb_sample");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("description").withIndex(4).ofType(Types.VARCHAR).withSize(500));
        addMetadata(displayName, ColumnMetadata.named("display_name").withIndex(3).ofType(Types.VARCHAR).withSize(100));
        addMetadata(email, ColumnMetadata.named("email").withIndex(2).ofType(Types.CHAR).withSize(100).notNull());
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.CHAR).withSize(50).notNull());
    }

}

