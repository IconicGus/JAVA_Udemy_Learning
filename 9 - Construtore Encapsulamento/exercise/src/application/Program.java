package application;

import entities.Account;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account1;

        System.out.print("Account Number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Name: ");
        String name = sc.next();

        System.out.print("Initial deposit (y/n)? ");
        String answer = sc.next();

        if (Objects.equals(answer, "y")){
            System.out.print("Deposit: ");
            double firstDeposit = sc.nextDouble();

            account1 = new Account(accountNumber, name, firstDeposit);

        }
        else {
            account1 = new Account(accountNumber, name);
        }

        System.out.printf("%nAccount Data:%n");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n%n", account1.getAccountNumber(), account1.getName(), account1.getBalance());


        System.out.print("Enter a deposit value: ");
        double amount = sc.nextDouble();

        account1.deposit(amount);

        System.out.printf("%nUpdated account data:");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n%n", account1.getAccountNumber(), account1.getName(), account1.getBalance());



        System.out.print("Enter a withdraw value: ");
        amount = sc.nextDouble();

        account1.withdraw(amount);

        System.out.printf("%nUpdated account data:");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", account1.getAccountNumber(), account1.getName(), account1.getBalance());

        sc.close();
    }

}
