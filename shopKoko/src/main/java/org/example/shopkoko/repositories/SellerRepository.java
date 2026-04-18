// Yergeshbay Yerkebulan 759000935
package org.example.shopkoko.repositories;

import org.example.shopkoko.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import jakarta.transaction.Transactional;
import java.util.List;

public interface SellerRepository extends JpaRepository<Seller, Long> {
    List<Seller> findBySellerName(String sellerName);

    @Query("SELECT s FROM Seller s WHERE s.storeName LIKE %:storeName%")
    List<Seller> searchByStoreName(String storeName);

    @Modifying
    @Transactional
    @Query("UPDATE Seller s SET s.sellerPhone = :phone WHERE s.sellerId = :id")
    int updateSellerPhoneById(Long id, String phone);
}