package org.example.shopkoko.repositories;

import org.example.shopkoko.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}