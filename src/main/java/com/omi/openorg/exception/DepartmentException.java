package com.omi.openorg.exception;


import java.io.Serial;

public class DepartmentException extends RuntimeException {

    @Serial
    private static final long serialVersionUID =1L;

    public DepartmentException(String userExceptionMSG) {
        super(userExceptionMSG);
    }

    public DepartmentException(String userExceptionMSG, Throwable e) {
        super(userExceptionMSG);
    }

}
