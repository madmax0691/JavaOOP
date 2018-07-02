package com.mkaz.homeworks.lesson6.connectionretryaccount;

public class AccountExpiredException extends AccountException {
    public AccountExpiredException(String message) {
        super(message);
    }

    public AccountExpiredException(String message, Throwable cause) {
        super(message, cause);
    }
}
