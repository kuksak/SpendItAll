package com.infy.saksh.repository;

import com.infy.saksh.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Sakshi Kukreti on 30-04-2017.
 */
public interface CategoryRepo extends JpaRepository<Category, Integer>{
}
