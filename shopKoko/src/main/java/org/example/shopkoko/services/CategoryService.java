// Muhammad Usman Habib - 761005924

package org.example.shopkoko.services;

import jakarta.transaction.Transactional;
import org.example.shopkoko.model.Category;
import org.example.shopkoko.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Optional<Category> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    public List<Category> getCategoriesByName(String categoryName) {
        return categoryRepository.findByCategoryName(categoryName);
    }

    public List<Category> getMainCategories() {
        return categoryRepository.findMainCategories();
    }

    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Category updateCategory(Long id, Category updatedCategory) {
        return categoryRepository.findById(id).map(category -> {
            category.setCategoryName(updatedCategory.getCategoryName());
            category.setDescription(updatedCategory.getDescription());
            category.setParentCategory(updatedCategory.getParentCategory());
            return categoryRepository.save(category);
        }).orElse(null);
    }

    public int updateCategoryDescription(Long id, String description) {
        return categoryRepository.updateDescriptionById(id, description);
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}