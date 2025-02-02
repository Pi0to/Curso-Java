package model.entities;

import model.exceptions.EnoughBalanceException;
import model.exceptions.WithdrawLimitException;

public class Account {
    public Integer number;
    public String holder;
    public Double balance;
    public Double withdrawLimit;


    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
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

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void withdraw(Double amount) throws WithdrawLimitException, EnoughBalanceException{
        if(amount > withdrawLimit) throw new WithdrawLimitException("The amount exceeds withdraw limit");
        if(amount > balance) throw new EnoughBalanceException("Not enough balance");


        balance -= amount;
    }
    public void deposit(Double amount){
        balance -= amount;
    }
}
