package com.test;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private OrderService orderService = new OrderService();

    public String create(String name, int quantity){
        if(quantity <= 0){
            return "error";
        }
        orderService.create(name,quantity);
        return "OK";
    }

}
