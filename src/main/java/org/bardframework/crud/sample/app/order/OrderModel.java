package org.bardframework.crud.sample.app.order;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.bardframework.crud.api.base.BaseModelAbstract;
import org.springframework.core.convert.converter.Converter;

import java.io.Serializable;

public class OrderModel extends BaseModelAbstract<OrderModel.OrderKey> {

    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public static class OrderKey implements Converter<String, OrderKey>, Serializable {
        private String customerId;
        private Integer productId;

        public OrderKey() {
        }

        public OrderKey(String customerId, Integer productId) {
            this.customerId = customerId;
            this.productId = productId;
        }

        public String getCustomerId() {
            return customerId;
        }

        public void setCustomerId(String customerId) {
            this.customerId = customerId;
        }

        public Integer getProductId() {
            return productId;
        }

        public void setProductId(Integer productId) {
            this.productId = productId;
        }

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
