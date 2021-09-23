package com.lukel.ecommerce.dto;

import com.lukel.ecommerce.entity.Address;
import com.lukel.ecommerce.entity.Customer;
import com.lukel.ecommerce.entity.Order;
import com.lukel.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
