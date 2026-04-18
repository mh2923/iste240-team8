// Muhammad Usman Habib - 761005924

package org.example.shopkoko.repositories;

import jakarta.transaction.Transactional;
import org.example.shopkoko.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByProductName(String productName);

    @Query("SELECT p FROM Product p WHERE p.productAvailable = true")
    List<Product> findAvailableProducts();

    @Modifying
    @Transactional
    @Query("UPDATE Product p SET p.productPrice = :productPrice WHERE p.productId = :id")
    int updateProductPriceById(Long id, double productPrice);
}
