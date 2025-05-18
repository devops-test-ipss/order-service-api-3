package com.dev.order_service_api_3.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "orders") // [relation database => (table,Data raw)] [non relation database => (collection, document)]
public class CustomerOrder {

    private String id;
    private List<Object> items; // List of products
    private double cost;
    private String customerEmail;


}
