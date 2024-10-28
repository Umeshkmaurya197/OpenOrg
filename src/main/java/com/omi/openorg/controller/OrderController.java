package com.omi.openorg.controller;

import com.omi.openorg.dto.Order;
import com.omi.openorg.dto.OrderEvent;
import com.omi.openorg.service.IOrderProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController
@RequestMapping("/openOrg/order")
public class OrderController {

    private static final Logger log = LoggerFactory.getLogger(OrderController.class);

    IOrderProducer orderProducer;

//  http://localhost:8080/openOrg/order/place-orders
    @PostMapping("/place-orders")
    public String placeOrder(@RequestBody Order order) {

        order.setOrderId(UUID.randomUUID().toString());
        log.info("placeOrder => order :" + order);

        OrderEvent orderEvent = new OrderEvent();

        orderEvent.setMessage("order status is in pending state");
        orderEvent.setStatus("PENDING");
        orderEvent.setOrder(order);
        orderProducer.sendMessage(orderEvent);
        return "Order Placed Successfully...";
    }



}
