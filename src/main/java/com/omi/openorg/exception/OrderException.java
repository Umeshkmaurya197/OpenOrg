package com.omi.openorg.exception;


import java.io.Serial;

public class OrderException extends RuntimeException {

    @Serial
    private static final long serialVersionUID =1L;

    public OrderException(String orderException) {
        super(orderException);
    }

    public OrderException(String orderExceptionMSG, Throwable e) {
        super(orderExceptionMSG);
    }
}
