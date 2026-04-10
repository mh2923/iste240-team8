package org.example.shopkoko.controllers;

import org.example.shopkoko.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
        model.addAttribute("productList", productService.getProducts());
        return "products";
    }
    @GetMapping("/products/add")
    public String addProductsPage() {
        return "addProducts";
    }

    @PostMapping("/products/add")
    public String saveProducts(Product product) {
        productService.addproduct(product);
        return "redirect:/add/success/product";
    }

    @GetMapping("/add/success/{entityName}")
    public String showSuccessPage(@PathVariable String entityName, Model model) {
        model.addAttribute("entityName", entityName);
        return "success";
    }
}