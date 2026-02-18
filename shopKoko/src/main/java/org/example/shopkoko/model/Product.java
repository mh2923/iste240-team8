package org.example.shopkoko.model;

import org.springframework.stereotype.Component;

@Component
public class Product {
    //Name of the attributes
    private String productname;
    private String productdescription;
    private String productprice;
    private String productquantity;
    private double productcost;
    private boolean productavailable;
    private Category category;

    //Constructor

    //Getters
    public String getProductname() {
        return productname;
    }
    public String getProductdescription() {
        return productdescription;
    }
    public String getProductprice() {
        return productprice;
    }
    public String getProductquantity() {
        return productquantity;
    }
    public double getProductcost() {
        return productcost;
    }
    public boolean getProductavailability() {
        return productavailable;
    }
    public Category getCategory() {
        return category;
    }
    //Setters
    public void setProductname(String productname) {
        this.productname = productname;
    }
    public void setProductdescription(String productdescription) {
        this.productdescription = productdescription;
    }
    public void setProductprice(String productprice) {
        this.productprice = productprice;
    }
    public void setProductquantity(String productquantity) {
        this.productquantity = productquantity;
    }
    public void setProductcost(double productcost) {
        this.productcost = productcost;
    }
    public void setProductavailable(boolean productavailable) {
        this.productavailable = productavailable;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
}
