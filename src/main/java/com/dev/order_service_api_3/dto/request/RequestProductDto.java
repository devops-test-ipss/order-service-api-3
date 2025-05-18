package com.dev.order_service_api_3.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestProductDto {

    private String description;
    private double unitePrice;
    private int orderQty;
}
