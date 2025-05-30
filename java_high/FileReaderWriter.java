import java.io.*;

public class FileReaderWriter {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("This is a sample file.");
            writer.close();

            FileReader reader = new FileReader("sample.txt");
            int i;
            while ((i = reader.read()) != -1)
                System.out.print((char) i);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}