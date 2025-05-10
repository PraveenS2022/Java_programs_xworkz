import java.io.*;
import java.util.*;
public class FileWordCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        HashMap<String, Integer> map = new HashMap<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] words = line.split("\s+");
            for (String word : words) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        br.close();
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}