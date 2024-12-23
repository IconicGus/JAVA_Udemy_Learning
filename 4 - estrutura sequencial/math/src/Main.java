public class Main {
    public static void main(String[] args) {
        int x, y;

        x = 5;
        y = 2*5;

        System.out.println(y);

        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B)/2*h;

        System.out.println(area);

        // casting - force the type of the variable

        int a, c;

        a = 5;
        c = 2;

        System.out.println(a/c);
        System.out.println((double) a/c);
    }
}