import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\easmrgu\\OneDrive - Ericsson\\Desktop\\JAVA - Learning\\udemy\\15 - working with files\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}