package application;

import entities.Account;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Account Number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Name: ");
        String name = sc.next();

        System.out.print("Initial deposit (y/n)? ");
        String answer = sc.next();

        if (Objects.equals(answer, "y")){
            System.out.print("Deposit: ");
            double firstDeposit = sc.nextDouble();

            Account account1 = new Account(accountNumber, name, firstDeposit);

            System.out.println("Account Data:");
            System.out.printf("Account %d, Holder: %s, Balance: $ %.2f", account1.getAccountNumber(), account1.getName(), account1.getBalance());
        }
        else {
            Account account1 = new Account(accountNumber, name);

            System.out.println("Account Data:");
            System.out.printf("Account %d, Holder: %s, Balance: $ %.2f", account1.getAccountNumber(), account1.getName(), account1.getBalance());
        }




        sc.close();
    }

}
