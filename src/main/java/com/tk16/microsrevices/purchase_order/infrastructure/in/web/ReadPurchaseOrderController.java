package com.tk16.microsrevices.purchase_order.infrastructure.in.web;

import com.tk16.microsrevices.purchase_order.application.ports.in.ReadPurchaseOrderUseCase;
import com.tk16.microsrevices.purchase_order.application.ports.in.models.ReadPurchaseOrderQuery;
import com.tk16.microsrevices.purchase_order.domain.PurchaseOrder;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/read")
public class ReadPurchaseOrderController {

    private final ReadPurchaseOrderUseCase readPurchaseOrderUseCase;

    public ReadPurchaseOrderController(
            ReadPurchaseOrderUseCase readPurchaseOrderUseCase) {
        this.readPurchaseOrderUseCase = readPurchaseOrderUseCase;
    }

    @GetMapping
    public PurchaseOrder readPurchaseOrder(@Valid @RequestBody ReadPurchaseOrderQuery query) {
        return readPurchaseOrderUseCase.readPurchaseOrder(query);
    }

    @GetMapping("/all")
    public List<PurchaseOrder> readAllPurchaseOrders() {
        return readPurchaseOrderUseCase.readAllPurchaseOrders();
    }
}
