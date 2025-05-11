import java.util.LinkedList;
public class Collections3 {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}