package org.example.shopkoko.repositories;

import org.example.shopkoko.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
public interface SellerRepository extends JpaRepository<Seller, Long> {

}