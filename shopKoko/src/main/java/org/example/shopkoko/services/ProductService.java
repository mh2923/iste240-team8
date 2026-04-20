// Muhammad Usman Habib - 761005924

package org.example.shopkoko.services;

import jakarta.transaction.Transactional;
import org.example.shopkoko.model.Product;
import org.example.shopkoko.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public List<Product> getProductsByName(String productName) {
        return productRepository.findByProductName(productName);
    }

    public List<Product> getAvailableProducts() {
        return productRepository.findAvailableProducts();
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product updatedProduct) {
        return productRepository.findById(id).map(product -> {
            product.setProductName(updatedProduct.getProductName());
            product.setProductDescription(updatedProduct.getProductDescription());
            product.setProductPrice(updatedProduct.getProductPrice());
            product.setProductQuantity(updatedProduct.getProductQuantity());
            product.setProductCost(updatedProduct.getProductCost());
            product.setProductAvailable(updatedProduct.isProductAvailable());
            product.setCategory(updatedProduct.getCategory());
            product.setSeller(updatedProduct.getSeller());
            return productRepository.save(product);
        }).orElse(null);
    }

    public int updateProductPrice(Long id, double price) {
        return productRepository.updateProductPriceById(id, price);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}