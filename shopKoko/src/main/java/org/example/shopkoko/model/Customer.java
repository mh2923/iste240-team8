package org.example.shopkoko.model;

import org.springframework.stereotype.Component;

@Component
public class Customer {
    private int customerId;
    private String customerName;

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
