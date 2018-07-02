package com.mkaz.homeworks.lesson6.connectionretryaccount;

public interface Account {
    void withdraw(long money) throws AccountException;
}
