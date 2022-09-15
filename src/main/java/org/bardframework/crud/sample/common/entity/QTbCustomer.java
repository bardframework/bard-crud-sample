package org.bardframework.crud.sample.common.entity;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.StringPath;
import com.querydsl.sql.ColumnMetadata;

import javax.annotation.processing.Generated;
import java.sql.Types;
import java.util.Arrays;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;


/**
 * QTbCustomer is a Querydsl query type for QTbCustomer
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTbCustomer extends com.querydsl.sql.RelationalPathBase<QTbCustomer> {

    public static final QTbCustomer tbCustomer = new QTbCustomer("tb_customer");
    private static final long serialVersionUID = -2029191274;
    public final StringPath description = createString("description");

    public final StringPath email = createString("email");

    public final StringPath firstName = createString("firstName");

    public final StringPath genderId = createString("genderId");

    public final StringPath id = createString("id");

    public final StringPath lastName = createString("lastName");

    public final com.querydsl.sql.PrimaryKey<QTbCustomer> primary = createPrimaryKey(id);

    public final com.querydsl.sql.ForeignKey<QTbGender> tbCustomerFkGender = createForeignKey(genderId, "id");

    public final com.querydsl.sql.ForeignKey<QTbOrder> _tbOrderFkCustomer = createInvForeignKey(Arrays.asList(id, id), Arrays.asList("customer_id", "customer_id"));

    public QTbCustomer(String variable) {
        super(QTbCustomer.class, forVariable(variable), "null", "tb_customer");
        addMetadata();
    }

    public QTbCustomer(String variable, String schema, String table) {
        super(QTbCustomer.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTbCustomer(String variable, String schema) {
        super(QTbCustomer.class, forVariable(variable), schema, "tb_customer");
        addMetadata();
    }

    public QTbCustomer(Path<? extends QTbCustomer> path) {
        super(path.getType(), path.getMetadata(), "null", "tb_customer");
        addMetadata();
    }

    public QTbCustomer(PathMetadata metadata) {
        super(QTbCustomer.class, metadata, "null", "tb_customer");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("description").withIndex(6).ofType(Types.VARCHAR).withSize(500));
        addMetadata(email, ColumnMetadata.named("email").withIndex(2).ofType(Types.CHAR).withSize(100).notNull());
        addMetadata(firstName, ColumnMetadata.named("first_name").withIndex(4).ofType(Types.VARCHAR).withSize(100));
        addMetadata(genderId, ColumnMetadata.named("gender_id").withIndex(3).ofType(Types.CHAR).withSize(50));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.CHAR).withSize(50).notNull());
        addMetadata(lastName, ColumnMetadata.named("last_name").withIndex(5).ofType(Types.VARCHAR).withSize(100));
    }

}

