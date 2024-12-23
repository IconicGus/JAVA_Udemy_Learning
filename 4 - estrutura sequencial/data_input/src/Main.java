import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.printf("You typed: %s and your age is" +
                " %d years old and your number is: %.2f%n", x, y, z);

        String s1, s2, s3;

        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.printf("DATA:%n%s%n%s%n%s", s1, s2, s3);

        sc.close();

    }
}