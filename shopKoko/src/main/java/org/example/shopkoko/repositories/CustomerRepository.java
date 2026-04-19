// Yergeshbay Yerkebulan 759000935
package org.example.shopkoko.repositories;

import org.example.shopkoko.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import jakarta.transaction.Transactional;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByCustomerName(String customerName);

    @Query("SELECT c FROM Customer c WHERE c.customerEmail LIKE %:email%")
    List<Customer> searchByEmail(String email);

    @Modifying
    @Transactional
    @Query("UPDATE Customer c SET c.customerAddress = :address WHERE c.customerId = :id")
    int updateCustomerAddressById(Long id, String address);
}