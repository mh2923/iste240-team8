// Yergeshbay Yerkebulan 759000935
package org.example.shopkoko.services;

import jakarta.transaction.Transactional;
import org.example.shopkoko.model.Seller;
import org.example.shopkoko.repositories.SellerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class SellerService {

    private final SellerRepository sellerRepository;

    public SellerService(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }

    public List<Seller> getAllSellers() {
        return sellerRepository.findAll();
    }

    public Optional<Seller> getSellerById(Long id) {
        return sellerRepository.findById(id);
    }

    public List<Seller> getSellersByName(String sellerName) {
        return sellerRepository.findBySellerName(sellerName);
    }

    public List<Seller> searchSellersByStoreName(String storeName) {
        return sellerRepository.searchByStoreName(storeName);
    }

    public Seller addSeller(Seller seller) {
        return sellerRepository.save(seller);
    }

    public Seller updateSeller(Long id, Seller updatedSeller) {
        return sellerRepository.findById(id).map(seller -> {
            seller.setSellerName(updatedSeller.getSellerName());
            seller.setSellerEmail(updatedSeller.getSellerEmail());
            seller.setSellerPhone(updatedSeller.getSellerPhone());
            seller.setSellerAddress(updatedSeller.getSellerAddress());
            seller.setStoreName(updatedSeller.getStoreName());
            return sellerRepository.save(seller);
        }).orElse(null);
    }

    public int updateSellerPhone(Long id, String phone) {
        return sellerRepository.updateSellerPhoneById(id, phone);
    }

    public void deleteSeller(Long id) {
        sellerRepository.deleteById(id);
    }
}