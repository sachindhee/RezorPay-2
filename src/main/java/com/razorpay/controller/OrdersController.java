package com.razorpay.controller;


import com.razorpay.Order;
import com.razorpay.RazorpayException;
import com.razorpay.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class OrdersController {
    @Autowired
   private  OrderService service ;

    @GetMapping("/order")
    public String orders(){
        return "Orders";
    }

    @PostMapping(value = "/createOrder",produces = "application/json")
    @ResponseBody
    public ResponseEntity<Order> createOrder(@RequestBody Order order) throws RazorpayException {

        Order razerPayOrder = service.createOrder(order);
        return  new ResponseEntity<>(razerPayOrder, HttpStatus.CREATED);
    }

}
