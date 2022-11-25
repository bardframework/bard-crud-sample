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
 * QTbProduct is a Querydsl query type for QTbProduct
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTbProduct extends com.querydsl.sql.RelationalPathBase<QTbProduct> {

    private static final long serialVersionUID = 1406629431;

    public static final QTbProduct tbProduct = new QTbProduct("tb_product");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Double> price = createNumber("price", Double.class);

    public final com.querydsl.sql.PrimaryKey<QTbProduct> primary = createPrimaryKey(id);

    public final com.querydsl.sql.ForeignKey<QTbOrder> _tbOrderFkProduct = createInvForeignKey(id, "product_id");

    public QTbProduct(String variable) {
        super(QTbProduct.class, forVariable(variable), "null", "tb_product");
        addMetadata();
    }

    public QTbProduct(String variable, String schema, String table) {
        super(QTbProduct.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTbProduct(String variable, String schema) {
        super(QTbProduct.class, forVariable(variable), schema, "tb_product");
        addMetadata();
    }

    public QTbProduct(Path<? extends QTbProduct> path) {
        super(path.getType(), path.getMetadata(), "null", "tb_product");
        addMetadata();
    }

    public QTbProduct(PathMetadata metadata) {
        super(QTbProduct.class, metadata, "null", "tb_product");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.VARCHAR).withSize(100).notNull());
        addMetadata(price, ColumnMetadata.named("price").withIndex(3).ofType(Types.DOUBLE).withSize(22).notNull());
    }

}

