package com.dev.order_service_api_3.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponsePaymentDto {
    private Date paymentDate;
    private String orderId;
    private String transactionId;
    private double amount;
    private String currency;
}
