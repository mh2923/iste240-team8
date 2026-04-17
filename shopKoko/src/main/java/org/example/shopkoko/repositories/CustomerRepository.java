package org.example.shopkoko.repositories;

import org.example.shopkoko.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Long> {

}