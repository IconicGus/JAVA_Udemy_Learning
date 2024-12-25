package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        // add
        list.add("Maria");
        list.add("Bob");
        list.add("Alex");
        list.add("Ana");
        list.add("Amanda");

        list.add(2, "Marco");

        for(String x: list){
            System.out.println(x);
        }

        //remove
        System.out.println("----------------");

        list.remove("Alex");
        list.removeIf(x -> x.charAt(0) == 'M');

        for(String x: list){
            System.out.println(x);
        }

        // get index
        System.out.println("----------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));

        // filter
        System.out.println("----------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for(String x: result){
            System.out.println(x);
        }

        // filter first occurrence
        System.out.println("---------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

    }

}
