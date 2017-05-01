package com.infy.saksh.domain.builder;

import com.infy.saksh.domain.Customer;
import com.infy.saksh.domain.CustomerOrder;
import com.infy.saksh.domain.OrderedProduct;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

/**
 * Created by Sakshi Kukreti on 30-04-2017.
 */
public final class CustomerOrderBuilder {
    private BigDecimal amount;
    private Date dateCreated;
    private Integer confirmationNumber;
    private Collection<OrderedProduct> orderedProductCollection;
    private Customer customer;

    private CustomerOrderBuilder() {
    }

    public static CustomerOrderBuilder aCustomerOrder() {
        return new CustomerOrderBuilder();
    }

    public CustomerOrderBuilder withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public CustomerOrderBuilder withDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    public CustomerOrderBuilder withConfirmationNumber(Integer confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
        return this;
    }

    public CustomerOrderBuilder withOrderedProductCollection(Collection<OrderedProduct> orderedProductCollection) {
        this.orderedProductCollection = orderedProductCollection;
        return this;
    }

    public CustomerOrderBuilder withCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public CustomerOrder build() {
        CustomerOrder customerOrder = new CustomerOrder();
        customerOrder.setAmount(amount);
        customerOrder.setDateCreated(dateCreated);
        customerOrder.setConfirmationNumber(confirmationNumber);
        customerOrder.setOrderedProductCollection(orderedProductCollection);
        customerOrder.setCustomer(customer);
        return customerOrder;
    }
}
