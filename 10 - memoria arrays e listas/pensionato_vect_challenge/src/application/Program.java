package application;

import entities.People;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Rooms to be rented? ");
        int n = sc.nextInt();

        People[] vect = new People[10];
        for (int i = 0; i < n; i++) {
            System.out.printf("%nRent #%d:%n", i+1);
            System.out.print("Name: ");
            String name =  sc.next();
            System.out.print("Email: ");
            String email =  sc.next();
            System.out.print("Room: ");
            int room  =  sc.nextInt();

            vect[room-1] = new People(name, email);
        }

        System.out.println("Busy rooms:");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.printf("%d: %s, %s%n", i+1, vect[i].getName(), vect[i].getEmail());
            }
        }

        sc.close();

    }

}
