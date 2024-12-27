package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n  = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + i+1 + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            String resp = sc.next();

            if (Objects.equals(resp, "i")) {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                Double price  = sc.nextDouble();
                System.out.print("Customs fee: ");
                Double fee  = sc.nextDouble();

                products.add(new ImportedProduct(name, price, fee));

            } else if (Objects.equals(resp, "c")) {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                Double price  = sc.nextDouble();

                products.add(new Product(name, price));

            }
            else {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                Double price  = sc.nextDouble();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String inputDate  = sc.next();

                Date date = dateFormat.parse(inputDate);

                products.add(new UsedProduct(name, price, date));

            }
        }

        for (Product prod: products) {
            prod.priceTag();
        }

        sc.close();
    }
}
