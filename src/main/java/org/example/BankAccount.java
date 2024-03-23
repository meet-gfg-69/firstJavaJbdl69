package org.example;

public class BankAccount {

    private String name;

    private double balance;

    public BankAccount(String name) {
        this.name = name;
        this.balance=0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Invalid amount");
            return;
        }
        this.balance+=amount;
    }

    public void withdraw(double amount){
        if(this.balance<amount){
            System.out.println("Insufficient balance");
            return;
        }
        this.balance-=amount;
    }
}
