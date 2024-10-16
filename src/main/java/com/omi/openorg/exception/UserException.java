package com.omi.openorg.exception;


import java.io.Serial;

public class UserException extends RuntimeException {

    @Serial
    private static final long serialVersionUID =1L;

    public UserException(String userExceptionMSG) {
        super(userExceptionMSG);
    }

    public UserException(String userExceptionMSG, Throwable e) {
        super(userExceptionMSG);
    }
}
