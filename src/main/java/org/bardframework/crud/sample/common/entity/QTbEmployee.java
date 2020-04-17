package org.bardframework.crud.sample.common.entity;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.StringPath;
import com.querydsl.sql.ColumnMetadata;

import javax.annotation.Generated;
import java.sql.Types;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;


/**
 * QTbEmployee is a Querydsl query type for QTbEmployee
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTbEmployee extends com.querydsl.sql.RelationalPathBase<QTbEmployee> {

    private static final long serialVersionUID = -1441896858;

    public static final QTbEmployee tbEmployee = new QTbEmployee("tb_employee");

    public final StringPath description = createString("description");

    public final StringPath email = createString("email");

    public final StringPath firstName = createString("firstName");

    public final StringPath id = createString("id");

    public final StringPath lastName = createString("lastName");

    public QTbEmployee(String variable) {
        super(QTbEmployee.class, forVariable(variable), "null", "tb_employee");
        addMetadata();
    }

    public QTbEmployee(String variable, String schema, String table) {
        super(QTbEmployee.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTbEmployee(String variable, String schema) {
        super(QTbEmployee.class, forVariable(variable), schema, "tb_employee");
        addMetadata();
    }

    public QTbEmployee(Path<? extends QTbEmployee> path) {
        super(path.getType(), path.getMetadata(), "null", "tb_employee");
        addMetadata();
    }

    public QTbEmployee(PathMetadata metadata) {
        super(QTbEmployee.class, metadata, "null", "tb_employee");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("description").withIndex(5).ofType(Types.VARCHAR).withSize(500));
        addMetadata(email, ColumnMetadata.named("email").withIndex(2).ofType(Types.CHAR).withSize(100).notNull());
        addMetadata(firstName, ColumnMetadata.named("first_name").withIndex(3).ofType(Types.VARCHAR).withSize(100));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.CHAR).withSize(50).notNull());
        addMetadata(lastName, ColumnMetadata.named("last_name").withIndex(4).ofType(Types.VARCHAR).withSize(100));
    }

}

