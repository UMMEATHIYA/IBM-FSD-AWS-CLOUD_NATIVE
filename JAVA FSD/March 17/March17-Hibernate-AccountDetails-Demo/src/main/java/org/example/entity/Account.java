package org.example.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class Account {
    @Id
    @Column(name = "accountNumber")
    private int AccountNumber;
    @Column(name = "accountName" )
    private String accountName;
    @Column(name = "balance" )
    private int balance;
    @Column(name = "Address" )
    private String Address;

    public Account(int accountNumber, String accountName, int balance, String Address) {
        AccountNumber = accountNumber;
        this.accountName = accountName;
        balance = balance;
        this.Address = Address;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        balance = balance;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Account{" +
                "AccountNumber=" + AccountNumber +
                ", accountName='" + accountName + '\'' +
                ", balance='" + balance + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
