package org.example.shopkoko.controllers;

import org.example.shopkoko.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.example.shopkoko.services.ProductService;

@Controller
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String getProducts(Model model) {
        model.addAttribute("productList", this.productService.getProducts());
        return "products";
    }
    @GetMapping("/products/add")
    public String addProductsPage(Model model) {
        return "addProducts";
    }

    @PostMapping("/products/add")
    public String saveProducts(Product product) {
        productService.addproduct(product);
        return "redirect:/products";
    }}