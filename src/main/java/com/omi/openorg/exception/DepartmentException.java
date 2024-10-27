package com.omi.openorg.exception;


import java.io.Serial;

public class DepartmentException extends RuntimeException {

    @Serial
    private static final long serialVersionUID =1L;

    public DepartmentException(String departmentExceptionMSG) {
        super(departmentExceptionMSG);
    }

    public DepartmentException(String departmentExceptionMSG, Throwable e) {
        super(departmentExceptionMSG);
    }

}
