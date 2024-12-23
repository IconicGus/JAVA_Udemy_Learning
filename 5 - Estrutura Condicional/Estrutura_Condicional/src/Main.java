import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x, z;
        double y, valor;
        String dia = "";
        String test;
        Scanner sc = new Scanner(System.in);

        System.out.print("Horas: ");
        x = sc.nextInt();

        if(x < 12){
            System.out.println("Bom dia");
        } else if (x < 18 && x >= 12) {
            System.out.println("Boa tarde");
        }
        else {
            System.out.println("Boa noite");
        }

        System.out.print("Minutos: ");
        y = sc.nextDouble();

        if(y <= 100){
            System.out.printf("Valor da conta: R$:%.2f%n", 50.00);
        }else{
            y -= 100;
            valor = (y*2) + 50;
            System.out.printf("Valor da conta: R$:%.2f%n", valor);
        }

        System.out.print("Dia: ");
        z = sc.nextInt();

        /*
        switch (z){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
        }
        */
        // ou:

        dia = switch (z) {
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            default -> dia;
        };

        System.out.printf("Dia da semana: %s%n", dia);

        // condição ternária

        // (condição) ? valor_se_verdadeiro : valor_se_falso

        test = (10 != 3) ? "V" : "F";

    }
}