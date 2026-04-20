// Muhammad Usman Habib - 761005924

package org.example.shopkoko.controllers;

import org.example.shopkoko.services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductRestController {

    private final ProductService productService;

    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }
}