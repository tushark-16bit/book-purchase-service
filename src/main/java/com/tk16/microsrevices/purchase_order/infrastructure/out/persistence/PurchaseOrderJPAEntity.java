package com.tk16.microsrevices.purchase_order.infrastructure.out.persistence;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity @Table(name = "purchase-order") public class PurchaseOrderJPAEntity {

    @Id private UUID orderId;
    private BigDecimal amount;
    private UUID userId;
    private String email;
    @ElementCollection
    @CollectionTable(name = "purchased-items", joinColumns = @JoinColumn(name = "Order-ID"))
    private List<String> itemsBought;

    public PurchaseOrderJPAEntity() {
    }

    public PurchaseOrderJPAEntity(UUID orderId, BigDecimal amount, UUID userId,
                                  String email, List<String> itemsBought) {
        this.orderId = orderId;
        this.amount = amount;
        this.userId = userId;
        this.email = email;
        this.itemsBought = itemsBought;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getItemsBought() {
        return itemsBought;
    }

    public void setItemsBought(List<String> itemsBought) {
        this.itemsBought = itemsBought;
    }
}
