package org.example.shopkoko.services;

import org.example.shopkoko.model.Product;
import org.example.shopkoko.model.Category;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private CategoryService categoryService;
    /*
    public class Product {
    //Name of the attributes
    private String productName;
    private String productDescription;
    private double productPrice;
    private int productQuantity;
    private double productCost;
    private boolean productAvailable;
    private Category category;
    */
    //Constructor
    public ProductService() {
        this.categoryService = new CategoryService();
    }
    Category mobile = categoryService.findCategorybyname("Mobile");
    Category Laptop = categoryService.findCategorybyname("Laptop");
    Category Headphones = categoryService.findCategorybyname("Headphones");

    Product pr1 = new Product(
            "IPhone 15 Pro",
            "It is an enterprising phone with 256GB storage and apple's A18 Bionic chip",
            2000.00,
            100,
            1000.00,
            true,
            mobile);
    Product pr2 = new Product(
            "HP Omen 16",
            "A laptop from the HP omen lineup providing apple's new intel i9 with RTX 4050",
            6000.00,
            100,
            5400.00,
            true,
            Laptop);
    Product pr3 = new Product(
            "SkullCandy Plyr",
            "It is an enterprising phone with 256GB storage and apple's A18 Bionic chip",
            2000.00,
            100,
            1000.00,
            false,
            Headphones);
    Product pr4 = new Product(
            "Iphone 16 Pro",
            "It is an enterprising phone with 256GB storage and apple's A18 Bionic chip",
            2500.00,
            100,
            2000.00,
            false,
            mobile);
    Product pr5 = new Product(
            "Asus TUFF",
            "It is an enterprising phone with 256GB storage and apple's A18 Bionic chip",
            2000.00,
            100,
            1000.00,
            true,
            Laptop);
}
