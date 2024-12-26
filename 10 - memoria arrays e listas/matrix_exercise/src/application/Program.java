package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int [][] mat = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int number = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j] == number) {
                    System.out.println("Position " + i + "," + j);

                    if (i > 0) {
                        System.out.println("Top: " + mat[i - 1][j]);
                    }

                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }

                    if (i < mat.length-1) {
                        System.out.println("Bottom: " + mat[i+1][j]);
                    }

                    if (j < mat.length-1) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                }
            }
        }

        sc.close();
    }

}
