package com.infy.saksh.controller;

import com.infy.saksh.domain.Category;
import com.infy.saksh.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Sakshi Kukreti on 01-05-2017.
 */
@RestController
@RequestMapping(value = "category")
public class CategoryController implements DefaultController<Category> {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    @Override
    public Category findById(@PathVariable Integer id) {
        return categoryService.findById(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
    @Override
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = "application/json")
    @Override
    public Iterable<Category> save(@RequestBody Iterable<Category> objects) {
        return categoryService.save(objects);
    }
}
