package org.example.shopkoko.model;

import org.springframework.stereotype.Component;

@Component
public class Product {
    //Name of the attributes
    private String productName;
    private String productDescription;
    private double productPrice;
    private int productQuantity;
    private double productCost;
    private boolean productAvailable;
    private Category category;

    //Constructor

    //Getters
    public String getProductname() {
        return productName;
    }
    public String getProductDescription() {
        return productDescription;
    }
    public double getProductPrice() {
        return productPrice;
    }
    public int getProductQuantity() {
        return productQuantity;
    }
    public double getProductCost() {
        return productCost;
    }
    public boolean getProductAvailability() {
        return productAvailable;
    }
    public Category getCategory() {
        return category;
    }
    //Setters
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
    public void setProductCost(double productCost) {
        this.productCost = productCost;
    }
    public void setProductAvailable(boolean productAvailable) {
        this.productAvailable = productAvailable;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
}
