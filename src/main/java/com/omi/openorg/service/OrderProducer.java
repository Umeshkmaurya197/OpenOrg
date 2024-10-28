package com.omi.openorg.service;

import com.omi.openorg.dto.OrderEvent;
import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;


public class OrderProducer implements IOrderProducer {

    private static final Logger log= LoggerFactory.getLogger(OrderProducer.class);

    @Autowired
    NewTopic topic ;

    @Autowired
    private KafkaTemplate<String, OrderEvent> kafkaTemplate;


    @Override
    public void sendMessage(OrderEvent orderEvent) {

        log.info(String.format("Order event => %s", orderEvent.toString()));

        // create Message
        Message<OrderEvent> message = MessageBuilder
                .withPayload(orderEvent)
                .setHeader(KafkaHeaders.TOPIC, topic.name())
                .build();

    }


}
