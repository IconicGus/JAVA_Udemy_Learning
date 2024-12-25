package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: : ");
        int quantity = sc.nextInt();

        Product product1 = new Product(name, price, quantity);

        System.out.printf(product1 + "%n");

        System.out.print("Enter the number of products to be added to teh stock: ");
        quantity = sc.nextInt();
        product1.addProducts(quantity);

        System.out.printf("Updated data: " + product1 + "%n");

        System.out.print("Enter the number of products to be removed to teh stock: ");
        quantity = sc.nextInt();
        product1.removeProducts(quantity);

        System.out.printf("Updated data: " + product1 + "%n");

        sc.close();

    }

}
