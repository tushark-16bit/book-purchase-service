package com.tk16.microsrevices.purchase_order.infrastructure.out.persistence;

import com.tk16.microsrevices.purchase_order.domain.PurchaseOrder;

import java.util.Locale;

public class PurchaseOrderEntityMapper {

    public static PurchaseOrderJPAEntity mapPurchaseOrderToEntity(PurchaseOrder order) {
        return new PurchaseOrderJPAEntity(
                order.getOrderId().getOrderId(),
                order.getAmount(),
                order.getUserId(),
                order.getEmail(),
                order.getItemsBought()
        );
    }

    public static PurchaseOrder mapEntityToPurchaseOrder(PurchaseOrderJPAEntity entity) {
        return new PurchaseOrder(
                new PurchaseOrder.PurchaseOrderId(entity.getOrderId()),
                entity.getAmount(),
                entity.getUserId(),
                entity.getEmail(),
                entity.getItemsBought()
        );
    }
}
