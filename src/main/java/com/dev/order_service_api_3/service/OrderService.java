package com.dev.order_service_api_3.service;

import com.dev.order_service_api_3.dto.request.RequestCustomerOrderDto;

public interface OrderService {

    public void create(RequestCustomerOrderDto requestCustomerOrderDto);


}
