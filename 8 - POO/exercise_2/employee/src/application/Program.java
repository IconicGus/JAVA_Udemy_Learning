package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name:");
        employee.name = sc.nextLine();
        System.out.print("Gross salary:");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax:");
        employee.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f%n%n", employee.name, employee.netSalary());

        System.out.print("Which percentage ro increase salary?");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.printf("%nUpdated data: %s, $ %.2f%n", employee.name, employee.netSalary());

        sc.close();

    }
}
