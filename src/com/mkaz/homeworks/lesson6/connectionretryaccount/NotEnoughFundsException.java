package com.mkaz.homeworks.lesson6.connectionretryaccount;

public class NotEnoughFundsException extends AccountException {
    public NotEnoughFundsException(String message) {
        super(message);
    }

    public NotEnoughFundsException(String message, Throwable cause) {
        super(message, cause);
    }
}
