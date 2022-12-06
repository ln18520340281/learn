package com.example.POJO;

public class Acount {
    private String accountusername;
    private double balance;
    private int id;

    @Override
    public String toString() {
        return "Acount [accountusername=" + accountusername + ", balance=" + balance + ", id=" + id + "]";
    }

    public String getAccountusername() {
        return accountusername;
    }

    public void setAccountusername(String accountusername) {
        this.accountusername = accountusername;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
