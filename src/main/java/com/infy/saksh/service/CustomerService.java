package com.infy.saksh.service;

import com.infy.saksh.domain.Customer;
import com.infy.saksh.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Sakshi Kukreti on 01-05-2017.
 */
@Service
public class CustomerService implements DefaultService<Customer> {

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public Customer findById(Integer id) {
        return customerRepo.findOne(id);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepo.findAll();
    }

    @Override
    public Iterable<Customer> save(Iterable<Customer> objects) {
        return customerRepo.save(objects);
    }


}
