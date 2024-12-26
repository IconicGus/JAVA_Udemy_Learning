package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++){

            System.out.printf("%nEmployee #%d:%n", i);
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Salary:");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);

        }

        System.out.printf("%nEmployee id to have a salary increase: ");
        int id = sc.nextInt();

        Integer pos = position(list, id);

        if (pos == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();

            list.get(pos).salaryIncrease(percentage);
        }

        for (Employee x: list){
            System.out.println(x);
        }

        sc.close();

    }

    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
