// Muhammad Usman Habib - 761005924

package org.example.shopkoko.repositories;

import org.example.shopkoko.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import jakarta.transaction.Transactional;
import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<Category> findByCategoryName(String categoryName);

    @Query("SELECT c FROM Category c WHERE c.parentCategory IS NULL")
    List<Category> findMainCategories();

    @Modifying
    @Transactional
    @Query("UPDATE Category c SET c.description = :description WHERE c.categoryId = :id")
    int updateDescriptionById(Long id, String description);
}