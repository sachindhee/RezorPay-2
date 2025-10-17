package com.razorpay.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Orders")
@Getter
@Setter
public class Orders {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer orderId;
        private String name;
        private String email;
        private Integer amount;
        private String orderStatus;
        private String razorpayOrderId;

}
