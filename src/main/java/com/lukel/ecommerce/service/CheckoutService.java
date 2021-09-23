package com.lukel.ecommerce.service;

import com.lukel.ecommerce.dto.Purchase;
import com.lukel.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
