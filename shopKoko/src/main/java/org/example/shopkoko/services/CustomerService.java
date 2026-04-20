// Yergeshbay Yerkebulan 759000935
package org.example.shopkoko.services;

import jakarta.transaction.Transactional;
import org.example.shopkoko.model.Customer;
import org.example.shopkoko.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    public List<Customer> getCustomersByName(String customerName) {
        return customerRepository.findByCustomerName(customerName);
    }

    public List<Customer> searchCustomersByEmail(String email) {
        return customerRepository.searchByEmail(email);
    }

    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Long id, Customer updatedCustomer) {
        return customerRepository.findById(id).map(customer -> {
            customer.setCustomerName(updatedCustomer.getCustomerName());
            customer.setCustomerEmail(updatedCustomer.getCustomerEmail());
            customer.setCustomerPhone(updatedCustomer.getCustomerPhone());
            customer.setCustomerAddress(updatedCustomer.getCustomerAddress());
            return customerRepository.save(customer);
        }).orElse(null);
    }

    public int updateCustomerAddress(Long id, String address) {
        return customerRepository.updateCustomerAddressById(id, address);
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

}
