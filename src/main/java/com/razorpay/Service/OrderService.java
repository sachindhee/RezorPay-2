package com.razorpay.Service;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import com.razorpay.repository.OrderRepository;
import jakarta.annotation.PostConstruct;
import org.json.JSONObject;
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

    @PostConstruct
    public void init() throws RazorpayException {
        this.razorpayClient = new RazorpayClient(razorpayId,razorpaySeceret);
    }

    public Order createOrder(Order order) throws RazorpayException {

        JSONObject json = new JSONObject();
        json.put("amount",order.getAmount() * 100);
        json.put("currency","INR");
        json.put("recept",order.getEmail());

        Order order1 = razorpayClient.orders.create(json);
        order.setRazorpayOrderId(order1.get("id"));
        order.setOrderStatus(order1.get("status"));

       return orderRepository.save(order1);

    }




}
