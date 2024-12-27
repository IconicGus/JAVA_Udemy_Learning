package model.entities;

import model.exceptions.DomainException;

public class Account {

    Integer number;
    String holder;
    Double balance, withdrawLimit;

    public Account(Double balance, String holder, Integer number, Double withdrawLimit) {
        this.balance = balance;
        this.holder = holder;
        this.number = number;
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) throws DomainException{
        if (balance <= amount) {
            throw new DomainException("Not enought balance!");
        }
        if (amount >= withdrawLimit) {
            throw new DomainException("Amount above the withdraw limit!");
        }
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "New balance: " + balance;
    }
}
