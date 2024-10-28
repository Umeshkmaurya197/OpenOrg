package com.omi.openorg.service;

import com.omi.openorg.dto.OrderEvent;

public interface IOrderProducer {
    void sendMessage(OrderEvent orderEvent);
}
