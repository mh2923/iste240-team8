// Yergeshbay Yerkebulan 759000935
package org.example.shopkoko.controllers;

import org.example.shopkoko.model.Seller;
import org.example.shopkoko.services.SellerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/sellers")
public class SellerRestController {

    private final SellerService sellerService;

    public SellerRestController(SellerService sellerService) {
        this.sellerService = sellerService;
    }

    @GetMapping
    public List<Seller> getAllSellers() {
        return sellerService.getAllSellers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Seller> getSellerById(@PathVariable Long id) {
        Optional<Seller> seller = sellerService.getSellerById(id);
        if (seller.isPresent()) {
            return ResponseEntity.ok(seller.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/search")
    public List<Seller> searchSellersByName(@RequestParam("name") String name) {
        return sellerService.getSellersByName(name);
    }

    @PostMapping
    public ResponseEntity<Seller> createSeller(@RequestBody Seller seller) {
        return ResponseEntity.ok(sellerService.addSeller(seller));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Seller> updateSeller(@PathVariable Long id, @RequestBody Seller updatedSeller) {
        Seller seller = sellerService.updateSeller(id, updatedSeller);
        if (seller == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(seller);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteSeller(@PathVariable Long id) {
        if (sellerService.getSellerById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        sellerService.deleteSeller(id);
        return ResponseEntity.ok("Seller deleted successfully.");
    }
}