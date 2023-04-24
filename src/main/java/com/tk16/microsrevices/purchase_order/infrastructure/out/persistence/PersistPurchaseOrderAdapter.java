package com.tk16.microsrevices.purchase_order.infrastructure.out.persistence;

import com.tk16.microsrevices.common.PersistenceAdapter;
import com.tk16.microsrevices.purchase_order.application.ports.out.PersistPurchaseOrderPort;
import com.tk16.microsrevices.purchase_order.domain.PurchaseOrder;

@PersistenceAdapter
public class PersistPurchaseOrderAdapter implements PersistPurchaseOrderPort {

    private final PurchaseOrderRepository repository;

    public PersistPurchaseOrderAdapter(PurchaseOrderRepository repository) {
        this.repository = repository;
    }

    @Override public void persistPurchaseOrder(PurchaseOrder order) {
        var entity = PurchaseOrderEntityMapper.mapPurchaseOrderToEntity(order);
        repository.saveAndFlush(entity);
    }
}
