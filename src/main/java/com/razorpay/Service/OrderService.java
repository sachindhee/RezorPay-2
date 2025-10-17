package com.razorpay.Service;

import com.razorpay.RazorpayClient;
import com.razorpay.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Value("${razorpay.key_id}")
    private String razorpayId;
    @Value("${razorpay.key.secret}")
    private String razorpaySeceret;

    private RazorpayClient razorpayClient;






}
