package com.infy.saksh;

import com.infy.saksh.domain.*;
import com.infy.saksh.domain.builder.*;
import com.infy.saksh.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.Date;

@SpringBootApplication
public class SpendItAllApplication {

    @Autowired
    private CategoryRepo categoryRepo;

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private CustomerOrderRepo customerOrderRepo;

    @Autowired
    private OrderedProductRepo orderedProductRepo;

    public static void main(String[] args) {
        SpringApplication.run(SpendItAllApplication.class, args);
    }

    @Bean
    CommandLineRunner init() {


        return (event) -> {


            Category cat = CategoryBuilder.aCategory()
                    .withName("Jeans")
                    .build();
            cat = categoryRepo.save(cat);

            Product product = ProductBuilder.aProduct()
                    .withName("Lewis Jeans")
                    .withPrice(new BigDecimal(134.50))
                    .withCategory(cat)
                    .withLastUpdate(new Date())
                    .build();
            product = productRepo.save(product);

            Customer customer = CustomerBuilder.aCustomer()
                    .withAddress("Vijay Nagar Phase 3")
                    .withCcNumber("+91")
                    .withCityRegion("Mysore")
                    .withEmail("sakshikukreti18@gmail.com")
                    .withName("Sakshi Kukreti")
                    .withPhone("9742698300")
                    .build();
            customer = customerRepo.save(customer);

            CustomerOrder customerOrder = CustomerOrderBuilder.aCustomerOrder()
                    .withCustomer(customer)
                    .withAmount(new BigDecimal(1240.00))
                    .withConfirmationNumber(1)
                    .withDateCreated(new Date())
                    .build();
            customerOrder = customerOrderRepo.save(customerOrder);

            OrderedProduct orderedProduct = OrderedProductBuilder.anOrderedProduct()
                    .withOrderedProductPK(OrderedProductPKBuilder.anOrderedProductPK()
                            .withProductId(product.getId())
                            .withCustomerOrderId(customerOrder.getId())
                            .build())
                    .withProduct(product)
                    .withQuantity(2)
                    .build();

            orderedProduct = orderedProductRepo.save(orderedProduct);

        };

    }
}
