package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.*;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i+1) + "data:");
            System.out.print("Individual or company (i/c)? ");
            String ans = sc.next();

            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            double income = sc.nextDouble();

            if (Objects.equals(ans, "i")) {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                list.add(new Individual(income, name, healthExpenditures));
            }
            else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(income, name, numberOfEmployees));
            }
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID: ");

        for (TaxPayer payer: list){
            System.out.printf("%s: $ %.2f%n", payer.getName(), payer.tax());
            sum += payer.tax();
        }

        System.out.println("TOTAL TAXES: $" + sum);

        sc.close();
    }
}
