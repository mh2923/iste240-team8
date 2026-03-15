package org.example.shopkoko.services;

import org.example.shopkoko.model.Product;
import org.example.shopkoko.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<Product>();
    private CategoryService categoryService;

    public ProductService() {
        this.categoryService = new CategoryService();
    //Constructor
    Category mobile = categoryService.findCategorybyname("Mobile");
    Category Laptop = categoryService.findCategorybyname("Laptop");
    Category Headphones = categoryService.findCategorybyname("Headphones");

    //Products
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
    //Adding to the list
        products.add(pr1);
        products.add(pr2);
        products.add(pr3);
        products.add(pr4);
        products.add(pr5);
}

    public List<Product> getProducts() {
        return products;
    }
    public void addproduct(Product product) {
        products.add(product);
    }
}
