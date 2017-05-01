package com.infy.saksh.domain.builder;

import com.infy.saksh.domain.Category;
import com.infy.saksh.domain.OrderedProduct;
import com.infy.saksh.domain.Product;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

/**
 * Created by Sakshi Kukreti on 30-04-2017.
 */
public final class ProductBuilder {
    private String name;
    private BigDecimal price;
    private Date lastUpdate;
    private Category category;
    private Collection<OrderedProduct> orderedProductCollection;

    private ProductBuilder() {
    }

    public static ProductBuilder aProduct() {
        return new ProductBuilder();
    }

    public ProductBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder withPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public ProductBuilder withLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }

    public ProductBuilder withCategory(Category category) {
        this.category = category;
        return this;
    }

    public ProductBuilder withOrderedProductCollection(Collection<OrderedProduct> orderedProductCollection) {
        this.orderedProductCollection = orderedProductCollection;
        return this;
    }

    public Product build() {
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setLastUpdate(lastUpdate);
        product.setCategory(category);
        product.setOrderedProductCollection(orderedProductCollection);
        return product;
    }
}
