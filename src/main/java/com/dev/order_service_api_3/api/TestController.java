package com.dev.order_service_api_3.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order-service/api/v1/test")
public class TestController {
    @RequestMapping
    public String test() {
        return "Hello from TestController";
    }
}
