// Muhammad Usman Habib - 761005924

package org.example.shopkoko.controllers;

import org.example.shopkoko.services.CategoryService;
import org.springframework.web.bind.annotation.*;

@RestController
public class CategoryRestController {

    private final CategoryService categoryService;

    public CategoryRestController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

}