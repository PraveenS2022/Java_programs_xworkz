public class FibonacciSeries {
    public static void printFibonacci(int count) {
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int count = 15;
        System.out.println("Fibonacci series up to " + count + " terms:");
        printFibonacci(count);
    }
}