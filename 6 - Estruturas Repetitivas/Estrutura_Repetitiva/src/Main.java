import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x;
        double soma = 0;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();

        while (x != 0){
            soma += x;
            x = sc.nextInt();
        }

        System.out.println(soma);

        int N = sc.nextInt();
        soma = 0;

        for (int i=0; i<N; i++){
            x = sc.nextInt();
            soma += x;
        }

        System.out.println(soma);

        sc.close();
    }
}