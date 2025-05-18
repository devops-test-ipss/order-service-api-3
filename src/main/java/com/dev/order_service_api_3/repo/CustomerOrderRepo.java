package com.dev.order_service_api_3.repo;

import com.dev.order_service_api_3.entity.CustomerOrder;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerOrderRepo extends MongoRepository<CustomerOrder, String> {
    // Custom query methods can be defined here if needed
    // For example, findByCustomerEmail(String customerEmail);
}
