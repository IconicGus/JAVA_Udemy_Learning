package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            String holder = sc.next();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("withdraw limit: ");
            double limit = sc.nextDouble();

            Account account = new Account(balance, holder, number, limit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);
            System.out.println(account);

        }catch (DomainException e) {
            System.out.println("Error:" + e.getMessage());
        }

        sc.close();
    }
}
