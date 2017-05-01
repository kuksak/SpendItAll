package com.infy.saksh.controller;

import com.infy.saksh.domain.Customer;
import com.infy.saksh.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Sakshi Kukreti on 01-05-2017.
 */
@RestController
@RequestMapping(value = "customer")
public class CustomerController implements DefaultController<Customer> {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    @Override
    public Customer findById(@PathVariable Integer id) {
        return customerService.findById(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
    @Override
    public List<Customer> findAll() {
        return customerService.findAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = "application/json")
    @Override
    public Iterable<Customer> save(@RequestBody Iterable<Customer> objects) {
        return customerService.save(objects);
    }
}
