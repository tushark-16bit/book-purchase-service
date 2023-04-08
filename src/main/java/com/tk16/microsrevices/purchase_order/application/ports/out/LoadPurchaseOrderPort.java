package com.tk16.microsrevices.purchase_order.application.ports.out;

import com.tk16.microsrevices.purchase_order.domain.PurchaseOrder;
import jakarta.persistence.EntityNotFoundException;

import java.util.List;
import java.util.UUID;

public interface LoadPurchaseOrderPort {

    PurchaseOrder getPurchaseOrderOrNull(UUID orderId);

    List<PurchaseOrder> readAllOrders();

    default PurchaseOrder validatePresentAndGet(UUID orderId) {
        var found = getPurchaseOrderOrNull(orderId);
        if (found==null) throw new EntityNotFoundException("Purchase Order " +
                "does not exist");
        return found;
    }
}
