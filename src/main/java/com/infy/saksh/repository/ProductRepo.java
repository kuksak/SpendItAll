package com.infy.saksh.repository;

import com.infy.saksh.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Sakshi Kukreti on 30-04-2017.
 */
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
