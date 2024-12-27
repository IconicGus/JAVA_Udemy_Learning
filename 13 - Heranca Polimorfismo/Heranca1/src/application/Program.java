package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {

        Account acc = new Account(0.0, "Alex", 1001);
        BusinessAccount bacc = new BusinessAccount(0.0, "Maria", 1002, 500.0);

        // UPCASTING
        // atribuir um objeto de uma subclasse para uma variavel da superclasse:

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(0.0, "Bob", 1003, 200.0);
        Account acc3 = new SavingsAccount(0.0, "Anna", 1004, 0.01);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount)acc2;

        // BusinessAccount acc5 = (BusinessAccount)acc3; -> não pode fazer o casting por acc2 não ser uma instancia de acc4

        // Sempre melhor verificar se uma é instancia da outra antes de fazer o casting!
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
        }

        Account acc6 = new Account(1000.0, "Alex", 1001);
        acc6.withdraw(200.0);
        System.out.println(acc6.getBalance());

        Account acc7 = new SavingsAccount(1000.0, "Maria", 1002, 0.01);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance());

        Account acc8 = new BusinessAccount(1000.0, "Bob", 1003, 500.0);
        acc8.withdraw(200.0);
        System.out.println(acc8.getBalance());
    }

}
