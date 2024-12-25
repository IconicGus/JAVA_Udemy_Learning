package entities;

public class Account {

    private final int accountNumber;
    private String name;
    private double balance;

    public Account(int accountNumber, String name, double amount){
        this.accountNumber = accountNumber;
        this.name = name;
        deposit(amount);
    }

    public Account(int accountNumber, String name){
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount - 5.0;
    }
}
