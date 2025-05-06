class Rectangle {
    int length, width;
    Rectangle(int l, int w) {
        length = l;
        width = w;
    }
    int area() {
        return length * width;
    }
}
public class RectangleArea {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 10);
        System.out.println("Area: " + r.area());
    }
}