import java.util.*;
class Student {
    int id;
    String name;
    double marks;
    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public String toString() {
        return id + " " + name + " " + marks;
    }
}
public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1, "Alice", 85.5));
        list.add(new Student(2, "Bob", 78.0));
        list.add(new Student(3, "Charlie", 90.2));
        for (Student s : list) {
            System.out.println(s);
        }
    }
}