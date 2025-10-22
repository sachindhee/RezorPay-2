package com.razorpay.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrdersController {

    @GetMapping("/order")
    public String orders(){
        return "Orders";
    }

//    @PostMapping()
//    @ResponseBody
//    public Res

}
