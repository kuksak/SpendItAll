package com.infy.saksh.service;

import com.infy.saksh.domain.Product;
import com.infy.saksh.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Sakshi Kukreti on 01-05-2017.
 */
@Service
public class ProductService implements DefaultService<Product> {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public Product findById(Integer id) {
        return productRepo.findOne(id);
    }

    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public Iterable<Product> save(Iterable<Product> objects) {
        return productRepo.save(objects);
    }


}
