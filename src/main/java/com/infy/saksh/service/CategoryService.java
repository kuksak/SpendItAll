package com.infy.saksh.service;

import com.infy.saksh.domain.Category;
import com.infy.saksh.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Sakshi Kukreti on 01-05-2017.
 */
@Service
public class CategoryService implements DefaultService<Category> {
    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public Category findById(Integer id) {
        return categoryRepo.findOne(id);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepo.findAll();
    }

    @Override
    public Iterable<Category> save(Iterable<Category> categories) {
        return categoryRepo.save(categories);
    }
}
