package com.tk16.microsrevices.purchase_order.application.services;

import com.tk16.microsrevices.common.UseCase;
import com.tk16.microsrevices.purchase_order.application.ports.in.ReadPurchaseOrderUseCase;
import com.tk16.microsrevices.purchase_order.application.ports.in.models.ReadPurchaseOrderQuery;
import com.tk16.microsrevices.purchase_order.application.ports.out.LoadPurchaseOrderPort;
import com.tk16.microsrevices.purchase_order.domain.PurchaseOrder;

import java.util.List;

@UseCase
class ReadPurchaseOrderService implements ReadPurchaseOrderUseCase {

    private final LoadPurchaseOrderPort loadPurchaseOrderPort;

    public ReadPurchaseOrderService(
            LoadPurchaseOrderPort loadPurchaseOrderPort) {
        this.loadPurchaseOrderPort = loadPurchaseOrderPort;
    }

    @Override
    public PurchaseOrder readPurchaseOrder(ReadPurchaseOrderQuery query) {
        return loadPurchaseOrderPort.validatePresentAndGet(query.getPurchaseOrderId());
    }

    @Override public List<PurchaseOrder> readAllPurchaseOrders() {
        return loadPurchaseOrderPort.readAllOrders();
    }
}
