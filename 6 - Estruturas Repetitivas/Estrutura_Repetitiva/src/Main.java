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


        double F;
        char resp;
        
        do {

            System.out.print("Digite a temperatura em Celsius: ");
            int temp = sc.nextInt();

            F = ((double) (9 * temp) /5) + 32;
            System.out.printf("Equivalente em Fahrenheit: %f%n", F);

            System.out.print("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);

        }while (resp != 'n');


        sc.close();
    }
}