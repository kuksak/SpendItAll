package com.infy.saksh.domain.builder;

import com.infy.saksh.domain.Category;
import com.infy.saksh.domain.Product;

import java.util.Collection;

/**
 * Created by Sakshi Kukreti on 30-04-2017.
 */
public final class CategoryBuilder {
    private String name;
    private Collection<Product> productCollection;

    private CategoryBuilder() {
    }

    public static CategoryBuilder aCategory() {
        return new CategoryBuilder();
    }

    public CategoryBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public CategoryBuilder withProductCollection(Collection<Product> productCollection) {
        this.productCollection = productCollection;
        return this;
    }

    public Category build() {
        Category category = new Category();
        category.setName(name);
        category.setProductCollection(productCollection);
        return category;
    }
}
