import java.util.Stack;
public class Collections5 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}