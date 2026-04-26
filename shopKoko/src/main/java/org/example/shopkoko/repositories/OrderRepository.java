package org.example.shopkoko.repositories;

import org.example.shopkoko.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import jakarta.transaction.Transactional;
import java.util.List;

/*Made by Tanmay*/
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByStatus(String status);

    @Query("SELECT o FROM Order o WHERE o.customer.customerId = :customerId")
    List<Order> findOrdersByCustomerId(Long customerId);

    @Modifying
    @Transactional
    @Query("UPDATE Order o SET o.status = :status WHERE o.orderId = :id")
    int updateStatusById(Long id, String status);
}