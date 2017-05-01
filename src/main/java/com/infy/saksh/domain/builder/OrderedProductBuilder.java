package com.infy.saksh.domain.builder;

import com.infy.saksh.domain.CustomerOrder;
import com.infy.saksh.domain.OrderedProduct;
import com.infy.saksh.domain.OrderedProductPK;
import com.infy.saksh.domain.Product;

/**
 * Created by Sakshi Kukreti on 30-04-2017.
 */
public final class OrderedProductBuilder {
    protected OrderedProductPK orderedProductPK;
    private Integer quantity;
    private Product product;
    private CustomerOrder customerOrder;

    private OrderedProductBuilder() {
    }

    public static OrderedProductBuilder anOrderedProduct() {
        return new OrderedProductBuilder();
    }

    public OrderedProductBuilder withOrderedProductPK(OrderedProductPK orderedProductPK) {
        this.orderedProductPK = orderedProductPK;
        return this;
    }

    public OrderedProductBuilder withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public OrderedProductBuilder withProduct(Product product) {
        this.product = product;
        return this;
    }

    public OrderedProductBuilder withCustomerOrder(CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
        return this;
    }

    public OrderedProduct build() {
        OrderedProduct orderedProduct = new OrderedProduct();
        orderedProduct.setOrderedProductPK(orderedProductPK);
        orderedProduct.setQuantity(quantity);
        orderedProduct.setProduct(product);
        orderedProduct.setCustomerOrder(customerOrder);
        return orderedProduct;
    }
}
