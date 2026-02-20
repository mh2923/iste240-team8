package org.example.shopkoko.model;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Order {
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private Product product;
    private int orderId;
    private LocalDate orderDate;
    private String orderDescription;
    private Customer customerId;
    private String status;

    public Customer getCustomerId() {
        return customerId;
    }
    public void setCustomer(Customer customerId) {
        this.customerId = customerId;
    }
}
