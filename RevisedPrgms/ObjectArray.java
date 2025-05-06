class Product {
    int id;
    String name;
    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void show() {
        System.out.println(id + " " + name);
    }
}
public class ObjectArray {
    public static void main(String[] args) {
        Product[] p = new Product[2];
        p[0] = new Product(1, "Pen");
        p[1] = new Product(2, "Notebook");
        for (Product item : p) {
            item.show();
        }
    }
}