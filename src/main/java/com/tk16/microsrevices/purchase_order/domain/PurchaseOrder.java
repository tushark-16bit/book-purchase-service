package com.tk16.microsrevices.purchase_order.domain;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class PurchaseOrder {

    private PurchaseOrderId orderId;
    private BigDecimal amount;
    private UUID userId;
    private String email;
    private List<String> itemsBought;

    public PurchaseOrder() {
    }

    public PurchaseOrder(PurchaseOrderId orderId, BigDecimal amount,
                         UUID userId,
                         String email, List<String> itemsBought) {
        this.orderId = orderId;
        this.amount = amount;
        this.userId = userId;
        this.email = email;
        this.itemsBought = itemsBought;
    }

    public PurchaseOrderId getOrderId() {
        return orderId;
    }

    public void setOrderId(PurchaseOrderId orderId) {
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

    public static class PurchaseOrderId {

        UUID orderId;

        public PurchaseOrderId() {
        }

        public PurchaseOrderId(UUID orderId) {
            this.orderId = orderId;
        }

        public UUID getOrderId() {
            return orderId;
        }

        public void setOrderId(UUID orderId) {
            this.orderId = orderId;
        }


    }
}
