package com.tk16.microsrevices.purchase_order.application.ports.out;

import com.tk16.microsrevices.purchase_order.domain.PurchaseOrder;

public interface PersistPurchaseOrderPort {

    void persistPurchaseOrder(PurchaseOrder order);
}
