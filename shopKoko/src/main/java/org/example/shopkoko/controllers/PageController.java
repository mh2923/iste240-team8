package org.example.shopkoko.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home() {
        return "forward:/html/index.html";
    }

    @GetMapping("/products")
    public String products() {
        return "forward:/html/products.html";
    }

    @GetMapping("/manage-products")
    public String manageProducts() {
        return "forward:/html/manage_products.html";
    }

    @GetMapping("/manage-categories")
    public String manageCategories() {
        return "forward:/html/manage_categories.html";
    }

    @GetMapping("/product")
    public String product() {
        return "forward:/html/product.html";
    }

    @GetMapping("/profile")
    public String profile() {
        return "forward:/html/profile.html";
    }

    @GetMapping("/cart")
    public String cart() {
        return "forward:/html/cart.html";
    }

    @GetMapping("/orders")
    public String orders() {
        return "forward:/html/cart.html";
    }

}
