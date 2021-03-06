package com.infy.saksh.repository;

import com.infy.saksh.domain.OrderedProduct;
import com.infy.saksh.domain.OrderedProductPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Sakshi Kukreti on 30-04-2017.
 */
public interface OrderedProductRepo extends JpaRepository<OrderedProduct, OrderedProductPK> {
}
