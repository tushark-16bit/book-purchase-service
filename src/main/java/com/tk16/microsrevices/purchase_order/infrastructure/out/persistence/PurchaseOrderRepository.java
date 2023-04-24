package com.tk16.microsrevices.purchase_order.infrastructure.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrderJPAEntity, UUID> {
}
