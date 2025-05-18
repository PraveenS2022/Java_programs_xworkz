


public class multipeException {
    public static void main(String[] args) {
        try {
            int [] numbers={1,2,3};
            System.out.println(numbers[5]);
            int result=10/0;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array index thappu");
        }
        catch (ArithmeticException e){
            System.out.println("number divide agalla");
        }
        catch (Exception e){
            System.out.println("vdxkj");
        }
    }
}
