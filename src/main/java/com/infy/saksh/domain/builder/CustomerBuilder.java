package com.infy.saksh.domain.builder;

import com.infy.saksh.domain.Customer;
import com.infy.saksh.domain.CustomerOrder;

import java.util.Collection;

/**
 * Created by Sakshi Kukreti on 30-04-2017.
 */
public final class CustomerBuilder {
    private String name;
    private String email;
    private String phone;
    private String address;
    private String cityRegion;
    private String ccNumber;
    private Collection<CustomerOrder> customerOrderCollection;

    private CustomerBuilder() {
    }

    public static CustomerBuilder aCustomer() {
        return new CustomerBuilder();
    }

    public CustomerBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public CustomerBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public CustomerBuilder withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public CustomerBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    public CustomerBuilder withCityRegion(String cityRegion) {
        this.cityRegion = cityRegion;
        return this;
    }

    public CustomerBuilder withCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
        return this;
    }

    public CustomerBuilder withCustomerOrderCollection(Collection<CustomerOrder> customerOrderCollection) {
        this.customerOrderCollection = customerOrderCollection;
        return this;
    }

    public Customer build() {
        Customer customer = new Customer();
        customer.setName(name);
        customer.setEmail(email);
        customer.setPhone(phone);
        customer.setAddress(address);
        customer.setCityRegion(cityRegion);
        customer.setCcNumber(ccNumber);
        customer.setCustomerOrderCollection(customerOrderCollection);
        return customer;
    }
}
