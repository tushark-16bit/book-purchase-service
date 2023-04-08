package com.tk16.microsrevices.purchase_order.application.ports.in.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class ReceivePurchaseOrderCommand {

    @NotNull
    private UUID cartId;
    @NotNull
    @Positive
    private BigDecimal amount;
    @NotNull
    private UUID userId;
    @NotNull
    @Email
    private String email;
    @NotNull
    private List<String> itemsBought;

    public ReceivePurchaseOrderCommand(UUID cartId) {
        this.cartId = cartId;
    }

    public ReceivePurchaseOrderCommand(UUID cartId, BigDecimal amount,
                                       UUID userId,
                                       String email, List<String> itemsBought) {
        this.cartId = cartId;
        this.amount = amount;
        this.userId = userId;
        this.email = email;
        this.itemsBought = itemsBought;
    }

    public UUID getCartId() {
        return cartId;
    }

    public void setCartId(UUID cartId) {
        this.cartId = cartId;
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
