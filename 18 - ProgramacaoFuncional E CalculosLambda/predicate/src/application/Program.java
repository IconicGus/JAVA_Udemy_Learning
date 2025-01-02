package application;

import entities.Product;
import util.PriceUpdate;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //list.removeIf(p -> p.getPrice() >= 100);

        list.removeIf(new ProductPredicate());

        list.forEach(new PriceUpdate());

        /*
        for (Product p: list) {
            System.out.println(p);
        }
         */

        list.forEach(System.out::println);

    }
}
