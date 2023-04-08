package com.tk16.microsrevices.purchase_order.application.services;

import com.tk16.microsrevices.common.UseCase;
import com.tk16.microsrevices.purchase_order.application.ports.in.ReceivePurchaseOrderUseCase;
import com.tk16.microsrevices.purchase_order.application.ports.in.models.ReceivePurchaseOrderCommand;
import com.tk16.microsrevices.purchase_order.application.ports.out.PersistPurchaseOrderPort;
import com.tk16.microsrevices.purchase_order.domain.PurchaseOrder;

@UseCase
class ReceivePurchaseOrderService implements ReceivePurchaseOrderUseCase {

    private final PersistPurchaseOrderPort persistPurchaseOrderPort;

    public ReceivePurchaseOrderService(
            PersistPurchaseOrderPort persistPurchaseOrderPort) {
        this.persistPurchaseOrderPort = persistPurchaseOrderPort;
    }

    @Override public void receivePurchaseOrder(
            ReceivePurchaseOrderCommand purchaseOrderCommand) {
        // map to book
        // send to  port to persist
        var purchaseOrder =
                ReceivePurchaseOrderCommandMapper.mapReceivePurchaseOrderCommandToPurchaseOrder(purchaseOrderCommand);
        persistPurchaseOrderPort.persistPurchaseOrder(purchaseOrder);
    }
}

class ReceivePurchaseOrderCommandMapper {
    static PurchaseOrder mapReceivePurchaseOrderCommandToPurchaseOrder(ReceivePurchaseOrderCommand command) {
        var mappedValue = new PurchaseOrder();
        mappedValue.setAmount(command.getAmount());
        mappedValue.setEmail(command.getEmail());
        mappedValue.setOrderId(new PurchaseOrder.PurchaseOrderId(command.getCartId()));
        mappedValue.setUserId(command.getUserId());
        mappedValue.setItemsBought(command.getItemsBought());
        return mappedValue;
    }
}
