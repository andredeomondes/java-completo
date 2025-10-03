package model.entities;

import model.exceptions.BalanceException;

import java.lang.classfile.constantpool.IntegerEntry;

public class Account {
    private Integer number;
    private String holder;
    private double balance;
    private double withDrawLimit;

    public Account(Integer number, String holder, double balance, double withDrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDrawLimit = withDrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithDrawLimit() {
        return withDrawLimit;
    }

    public void setWithDrawLimit(double withDrawLimit) {
        this.withDrawLimit = withDrawLimit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > withDrawLimit) {
            throw new BalanceException("The amount exceeds withdraw limit");
        }
        if (amount > balance) {
            throw new BalanceException("Not enough balance");

        } else {
            balance -= amount;
        }
    }

}
