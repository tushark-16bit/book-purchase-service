package com.tk16.microsrevices.purchase_order.infrastructure.out.persistence;

import com.tk16.microsrevices.common.PersistenceAdapter;
import com.tk16.microsrevices.purchase_order.application.ports.out.LoadPurchaseOrderPort;
import com.tk16.microsrevices.purchase_order.domain.PurchaseOrder;

import java.util.List;
import java.util.UUID;

@PersistenceAdapter
public class LoadPurchaseOrderAdapter implements LoadPurchaseOrderPort {

    private final PurchaseOrderRepository repository;

    public LoadPurchaseOrderAdapter(PurchaseOrderRepository repository) {
        this.repository = repository;
    }

    @Override public PurchaseOrder getPurchaseOrderOrNull(UUID orderId) {
        var foundEntity = repository.findById(orderId).orElse(null);
        if (foundEntity == null) {
            return null;
        } else {
            return PurchaseOrderEntityMapper.mapEntityToPurchaseOrder(
                    foundEntity);
        }
    }

    @Override public List<PurchaseOrder> readAllOrders() {
        var foundEntities = repository.findAll();
        return foundEntities.stream()
                .map(PurchaseOrderEntityMapper::mapEntityToPurchaseOrder)
                .toList();
    }
}
