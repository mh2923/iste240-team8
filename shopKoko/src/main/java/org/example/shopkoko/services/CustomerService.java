package org.example.shopkoko.services;

import org.example.shopkoko.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    private List<Customer> customersList = new ArrayList<Customer>();
    Customer cs1 = new Customer(001,
            "Tanmay",
            "tanmay@gmail.com",
            1231234324,
            "RIT Dubai");
    Customer cs2 = new Customer(002,
            "Usman",
            "usman@gmail.com",
            1223213241,
            "Rit Dubai");
    Customer cs3 = new Customer(003,
            "Erke",
            "Erke@gmail.com",
            02313421323,
            "Rit Dubai");
    //Constructor
    public CustomerService() {
        customersList.add(cs1);
        customersList.add(cs2);
        customersList.add(cs3);
    }
    public List<Customer> getCustomersList() {
        return customersList;
    }
    public void addCustomer(Customer customer){
        customersList.add(customer);
    }
}
