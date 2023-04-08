package com.tk16.microsrevices.purchase_order.application.ports.in;

import com.tk16.microsrevices.purchase_order.application.ports.in.models.ReceivePurchaseOrderCommand;

public interface ReceivePurchaseOrderUseCase {

    void receivePurchaseOrder(ReceivePurchaseOrderCommand purchaseOrderCommand);
}
