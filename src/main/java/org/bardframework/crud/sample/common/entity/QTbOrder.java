package org.bardframework.crud.sample.common.entity;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.StringPath;
import com.querydsl.sql.ColumnMetadata;

import javax.annotation.processing.Generated;
import java.sql.Types;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;


/**
 * QTbOrder is a Querydsl query type for QTbOrder
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTbOrder extends com.querydsl.sql.RelationalPathBase<QTbOrder> {

    public static final QTbOrder tbOrder = new QTbOrder("tb_order");
    private static final long serialVersionUID = 201646742;
    public final NumberPath<Integer> count = createNumber("count", Integer.class);

    public final StringPath customerId = createString("customerId");

    public final NumberPath<Integer> productId = createNumber("productId", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QTbOrder> primary = createPrimaryKey(customerId, productId);

    public final com.querydsl.sql.ForeignKey<QTbCustomer> tbOrderFkCustomer = createForeignKey(customerId, "id");

    public final com.querydsl.sql.ForeignKey<QTbProduct> tbOrderFkProduct = createForeignKey(productId, "id");

    public QTbOrder(String variable) {
        super(QTbOrder.class, forVariable(variable), "null", "tb_order");
        addMetadata();
    }

    public QTbOrder(String variable, String schema, String table) {
        super(QTbOrder.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTbOrder(String variable, String schema) {
        super(QTbOrder.class, forVariable(variable), schema, "tb_order");
        addMetadata();
    }

    public QTbOrder(Path<? extends QTbOrder> path) {
        super(path.getType(), path.getMetadata(), "null", "tb_order");
        addMetadata();
    }

    public QTbOrder(PathMetadata metadata) {
        super(QTbOrder.class, metadata, "null", "tb_order");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(count, ColumnMetadata.named("count").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(customerId, ColumnMetadata.named("customer_id").withIndex(1).ofType(Types.CHAR).withSize(50).notNull());
        addMetadata(productId, ColumnMetadata.named("product_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

