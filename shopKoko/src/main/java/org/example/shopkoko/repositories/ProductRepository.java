package org.example.shopkoko.repositories;

import org.example.shopkoko.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
