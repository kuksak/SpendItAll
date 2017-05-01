package com.infy.saksh.controller;

import com.infy.saksh.domain.Product;
import com.infy.saksh.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Sakshi Kukreti on 01-05-2017.
 */
@RestController
@RequestMapping(value = "product")
public class ProductController implements DefaultController<Product> {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    @Override
    public Product findById(@PathVariable Integer id) {
        return productService.findById(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
    @Override
    public List<Product> findAll() {
        return productService.findAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = "application/json")
    @Override
    public Iterable<Product> save(@RequestBody Iterable<Product> objects) {
        return productService.save(objects);
    }
}
