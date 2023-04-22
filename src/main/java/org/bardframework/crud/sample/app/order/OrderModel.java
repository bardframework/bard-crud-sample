package org.bardframework.crud.sample.app.order;

import lombok.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.bardframework.crud.api.base.BaseModelAbstract;
import org.springframework.core.convert.converter.Converter;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class OrderModel extends BaseModelAbstract<OrderModel.OrderKey> {

    private Integer count;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderKey implements Converter<String, OrderKey>, Serializable {
        private String customerId;
        private Integer productId;

        @Override
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || getClass() != other.getClass()) {
                return false;
            }

            OrderKey otherKey = (OrderKey) other;

            return new EqualsBuilder().append(customerId, otherKey.customerId).append(productId, otherKey.productId).isEquals();
        }

        @Override
        public int hashCode() {
            return new HashCodeBuilder(17, 37).append(customerId).append(productId).toHashCode();
        }

        @Override
        public String toString() {
            return String.format("%s:%d", this.customerId, this.productId);
        }

        @Override
        public OrderKey convert(String value) {
            if (StringUtils.isBlank(value)) {
                return null;
            }
            return new OrderKey(value.split(":")[0], Integer.parseInt(value.split(":")[1]));
        }
    }
}
