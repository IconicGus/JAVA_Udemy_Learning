package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product1 = new Product();

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product1.name = sc.nextLine();
        System.out.print("Price: ");
        product1.price = sc.nextDouble();
        System.out.print("Quantity in stock: : ");
        product1.quantity = sc.nextInt();

        System.out.printf(product1 + "%n");

        System.out.print("Enter the number of products to be added to teh stock: ");
        int quantity = sc.nextInt();
        product1.addProducts(quantity);

        System.out.printf("Updated data: " + product1 + "%n");

        System.out.print("Enter the number of products to be removed to teh stock: ");
        quantity = sc.nextInt();
        product1.removeProducts(quantity);

        System.out.printf("Updated data: " + product1 + "%n");

        sc.close();

    }

}
