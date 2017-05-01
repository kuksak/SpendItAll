package com.infy.saksh.service;

import com.infy.saksh.domain.CustomerOrder;
import com.infy.saksh.repository.CustomerOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Sakshi Kukreti on 01-05-2017.
 */
@Service
public class CustomerOrderService implements DefaultService<CustomerOrder> {

    @Autowired
    private CustomerOrderRepo customerOrderRepo;

    @Override
    public CustomerOrder findById(Integer id) {
        return customerOrderRepo.findOne(id);
    }

    @Override
    public List<CustomerOrder> findAll() {
        return customerOrderRepo.findAll();
    }

    @Override
    public Iterable<CustomerOrder> save(Iterable<CustomerOrder> customerOrders) {
        return customerOrderRepo.save(customerOrders);
    }


}
