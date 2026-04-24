// Muhammad Usman Habib - 761005924

package org.example.shopkoko.controllers;

import org.example.shopkoko.model.Category;
import org.example.shopkoko.services.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categories")
public class CategoryRestController {

    private final CategoryService categoryService;

    public CategoryRestController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable Long id) {
        Optional<Category> category = categoryService.getCategoryById(id);
        if (category.isPresent()) {
            return ResponseEntity.ok(category.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/search")
    public List<Category> searchCategoriesByName(@RequestParam("name") String name) {
        return categoryService.getCategoriesByName(name);
    }

    @GetMapping("/main")
    public List<Category> getMainCategories() {
        return categoryService.getMainCategories();
    }

    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
        return ResponseEntity.ok(categoryService.addCategory(category));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Category> updateCategory(@PathVariable Long id, @RequestBody Category updatedCategory) {
        Category category = categoryService.updateCategory(id, updatedCategory);
        if (category == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(category);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable Long id) {
        if (categoryService.getCategoryById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        categoryService.deleteCategory(id);
        return ResponseEntity.ok("Category deleted successfully.");
    }
}