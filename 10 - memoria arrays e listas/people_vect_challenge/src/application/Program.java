package application;

import entities.People;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qntd pessoas: ");
        int n = sc.nextInt();

        People[] vect = new People[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%nDados da %da pessoa:%n", i+1);
            System.out.print("Nome: ");
            String name =  sc.next();
            System.out.print("Idade: ");
            int age =  sc.nextInt();
            System.out.print("Altura: ");
            double height  =  sc.nextDouble();

            vect[i] = new People(height, age, name);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getHeight();
        }

        double lessThanSixteen = 0.0;
        //double[] vect2 = new double[vect.length];
        for (int i = 0; i < vect.length; i++) {
            if(vect[i].getAge() < 16){
                lessThanSixteen += 1;
            }
        }

        System.out.printf("%nMean: %.2f%n", sum/vect.length);
        System.out.printf("Pessoas com menos de 16: %.2f %%", (lessThanSixteen/vect.length)*100);
        System.out.printf("%n");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                System.out.println(vect[i].getName());
            }
        }

        sc.close();

    }

}
