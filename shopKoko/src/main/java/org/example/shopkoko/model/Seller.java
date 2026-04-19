// Yergeshbay Yerkebulan 759000935
package org.example.shopkoko.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sellers")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seller_id")
    private Long sellerId;

    @Column(name = "seller_name", nullable = false, length = 100)
    private String sellerName;

    @Column(name = "seller_email", nullable = false, unique = true, length = 120)
    private String sellerEmail;

    @Column(name = "seller_phone", length = 20)
    private String sellerPhone;

    @Column(name = "seller_address", length = 255)
    private String sellerAddress;

    @Column(name = "store_name", nullable = false, length = 120)
    private String storeName;

    public Seller() {
    }

    public Seller(String sellerName, String sellerEmail, String sellerPhone,
                  String sellerAddress, String storeName) {
        this.sellerName = sellerName;
        this.sellerEmail = sellerEmail;
        this.sellerPhone = sellerPhone;
        this.sellerAddress = sellerAddress;
        this.storeName = storeName;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerEmail() {
        return sellerEmail;
    }

    public void setSellerEmail(String sellerEmail) {
        this.sellerEmail = sellerEmail;
    }

    public String getSellerPhone() {
        return sellerPhone;
    }

    public void setSellerPhone(String sellerPhone) {
        this.sellerPhone = sellerPhone;
    }

    public String getSellerAddress() {
        return sellerAddress;
    }

    public void setSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
}