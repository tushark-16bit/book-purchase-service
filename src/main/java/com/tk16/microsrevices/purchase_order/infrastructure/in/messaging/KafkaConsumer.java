package com.tk16.microsrevices.purchase_order.infrastructure.in.messaging;

import com.tk16.microsrevices.common.KafkaComponent;
import com.tk16.microsrevices.purchase_order.application.ports.in.ReceivePurchaseOrderUseCase;
import com.tk16.microsrevices.purchase_order.application.ports.in.models.ReceivePurchaseOrderCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

@KafkaComponent
public class KafkaConsumer {

    Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    private final ReceivePurchaseOrderUseCase receivePurchaseOrderUseCase;

    public KafkaConsumer(
            ReceivePurchaseOrderUseCase receivePurchaseOrderUseCase) {
        this.receivePurchaseOrderUseCase = receivePurchaseOrderUseCase;
    }

    @KafkaListener(topics = "topicName", containerFactory = "receivePurchaseOrderCommandConcurrentKafkaListenerContainerFactory")
    public void listenForCommand(ReceivePurchaseOrderCommand command) {
        logger.info("Kafka message received: {}", command);
        receivePurchaseOrderUseCase.receivePurchaseOrder(command);
    }
}
