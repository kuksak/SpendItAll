package com.infy.saksh.service;

import com.infy.saksh.domain.OrderedProduct;
import com.infy.saksh.domain.OrderedProductPK;
import com.infy.saksh.domain.builder.OrderedProductPKBuilder;
import com.infy.saksh.repository.OrderedProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Sakshi Kukreti on 01-05-2017.
 */
@Service
public class OrderedProductService implements DefaultService<OrderedProduct> {
    @Autowired
    private OrderedProductRepo orderedProductRepo;

    public OrderedProduct findById(Integer productId, Integer customerOrderId) {
        OrderedProductPK orderedProductPK = OrderedProductPKBuilder.anOrderedProductPK()
                .withProductId(productId)
                .withCustomerOrderId(customerOrderId)
                .build();
        return orderedProductRepo.findOne(orderedProductPK);
    }

    @Override
    public List<OrderedProduct> findAll() {
        return orderedProductRepo.findAll();
    }

    @Override
    public Iterable<OrderedProduct> save(Iterable<OrderedProduct> objects) {
        return orderedProductRepo.save(objects);
    }


}
