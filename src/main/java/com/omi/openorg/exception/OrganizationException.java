package com.omi.openorg.exception;

import java.io.Serial;

public class OrganizationException extends RuntimeException {

    @Serial
    private static final long serialVersionUID =1L;

    public OrganizationException(String orgnizationExceptionMSG) {
        super(orgnizationExceptionMSG);
    }

    public OrganizationException(String orgnizationExceptionMSG, Throwable e) {
        super(orgnizationExceptionMSG);
    }
}
