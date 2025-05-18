package com.dev.order_service_api_3.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestCustomerOrderDto {

    private List<Object> items; // List of products
    private double cost;
    private String customerEmail;

}
