import java.io.*;
import java.util.*;

public class FileStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filename = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            int lines = 0, words = 0, chars = 0;
            String line;
            while ((line = br.readLine()) != null) {
                lines++;
                chars += line.length();
                words += line.split("\\s+").length;
            }
            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + chars);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}