public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        System.out.println("Good morning!");

        int x = 22;
        double y = 22.12345;

        System.out.println(x);
        System.out.printf("%.2f%n", y); // format output - only 2 numbers after comma
        System.out.printf("%.4f%n", y); // format output - only 4 numbers after comma

        System.out.println("Idade: " + x + " anos");
        System.out.printf("Distância: %.2f metros%n", y);

        String name = "Gustavo";
        int age = 22;
        double salary = 7000.0;

        System.out.printf("%s tem %d anos e ganha R$: %.2f reais%n", name, age, salary);


    }
}