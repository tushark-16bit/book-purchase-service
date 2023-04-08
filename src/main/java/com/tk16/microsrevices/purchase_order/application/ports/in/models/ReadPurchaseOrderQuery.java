package com.tk16.microsrevices.purchase_order.application.ports.in.models;

import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public class ReadPurchaseOrderQuery {

    @NotNull
    private UUID purchaseOrderId;

    public ReadPurchaseOrderQuery(UUID purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public ReadPurchaseOrderQuery() {
    }

    public UUID getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(UUID purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }
}
