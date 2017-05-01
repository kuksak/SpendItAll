package com.infy.saksh.repository;

import com.infy.saksh.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Sakshi Kukreti on 30-04-2017.
 */
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
