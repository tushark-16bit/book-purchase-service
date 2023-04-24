package com.tk16.microsrevices.purchase_order.application.ports.in;

import com.tk16.microsrevices.purchase_order.application.ports.in.models.ReadPurchaseOrderQuery;
import com.tk16.microsrevices.purchase_order.application.ports.out.LoadPurchaseOrderPort;
import com.tk16.microsrevices.purchase_order.domain.PurchaseOrder;

import java.util.List;

public interface ReadPurchaseOrderUseCase {

    PurchaseOrder readPurchaseOrder(ReadPurchaseOrderQuery query);

    List<PurchaseOrder> readAllPurchaseOrders();
}
