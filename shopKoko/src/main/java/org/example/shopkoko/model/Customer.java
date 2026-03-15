package org.example.shopkoko.model;

import org.springframework.stereotype.Component;

@Component
public class Customer {
    private int customerId;
    private String customerName;
    private String customerEmail;
    private int customerPhone;
    private String customerAddress;

    //Constructors
    public Customer() {}
    public Customer(int customerId,
                    String customerName,
                    String customerEmail,
                    int customerPhone,
                    String customerAddress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.customerAddress = customerAddress;
    }


    //Getters
    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public int getCustomerPhone() {
        return customerPhone;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }


    //Setters
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setCustomerPhone(int customerPhone) {
        this.customerPhone = customerPhone;
    }
}