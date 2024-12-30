import java.io.*;
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

        writeFile(path);

    }

    public static void writeFile(String path) {

        String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void playingWithFolders() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS:");
        
        for (File folder : folders) {
            System.out.println(folder);
        }
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:");
        for (File file : files) {
            System.out.println(file);
        }
        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + success);
        sc.close();

    }
}