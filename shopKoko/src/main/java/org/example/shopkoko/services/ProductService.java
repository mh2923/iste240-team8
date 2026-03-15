package org.example.shopkoko.services;

import org.example.shopkoko.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = new ArrayList<Product>();

    public ProductService() {

    }
    public List<Product> findALl(){
        return products;
    }
}
