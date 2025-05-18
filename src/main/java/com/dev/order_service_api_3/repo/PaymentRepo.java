package com.dev.order_service_api_3.repo;

import com.dev.order_service_api_3.entity.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepo extends MongoRepository<Payment, String> {
    // Custom query methods can be defined here if needed
    // For example, findByPaymentId(String paymentId);
}
