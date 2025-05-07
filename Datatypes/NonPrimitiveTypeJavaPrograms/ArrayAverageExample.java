public class ArrayAverageExample {
    public static void main(String[] args) {
        double[] marks = {85.5, 90.0, 78.5};
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        double average = total / marks.length;
        System.out.println("Average marks: " + average);
    }
}