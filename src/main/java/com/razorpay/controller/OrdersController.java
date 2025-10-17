package com.razorpay.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrdersController {

    @GetMapping("/order")
    public String orders(){
        return "Orders";
    }
}
