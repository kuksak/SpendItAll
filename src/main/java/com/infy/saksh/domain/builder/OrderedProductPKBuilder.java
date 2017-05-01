package com.infy.saksh.domain.builder;

import com.infy.saksh.domain.OrderedProductPK;

/**
 * Created by Sakshi Kukreti on 30-04-2017.
 */
public final class OrderedProductPKBuilder {
    private Integer customerOrderId;
    private Integer productId;

    private OrderedProductPKBuilder() {
    }

    public static OrderedProductPKBuilder anOrderedProductPK() {
        return new OrderedProductPKBuilder();
    }

    public OrderedProductPKBuilder withCustomerOrderId(Integer customerOrderId) {
        this.customerOrderId = customerOrderId;
        return this;
    }

    public OrderedProductPKBuilder withProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    public OrderedProductPK build() {
        OrderedProductPK orderedProductPK = new OrderedProductPK();
        orderedProductPK.setCustomerOrderId(customerOrderId);
        orderedProductPK.setProductId(productId);
        return orderedProductPK;
    }
}
