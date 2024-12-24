package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc  = new Scanner(System.in);

        System.out.print("Dollar price? ");
        double price = sc.nextDouble();
        System.out.print("How many dollars to be bought? ");
        double quantity = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.amount(quantity, price));

        sc.close();

    }

}
