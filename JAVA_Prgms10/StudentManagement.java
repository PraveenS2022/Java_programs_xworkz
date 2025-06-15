public class StudentManagement {
    static class Student {
        int id;
        String name;
        double marks;

        Student(int id, String name, double marks) {
            this.id = id;
            this.name = name;
            this.marks = marks;
        }

        void display() {
            System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
        }
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student(1, "Alice", 89.5),
            new Student(2, "Bob", 76.0),
            new Student(3, "Charlie", 92.3),
            new Student(4, "David", 68.4),
            new Student(5, "Eva", 88.8)
        };

        System.out.println("All Students:");
        for (Student s : students) {
            s.display();
        }

        System.out.println("\nTopper:");
        Student topper = students[0];
        for (Student s : students) {
            if (s.marks > topper.marks) {
                topper = s;
            }
        }
        topper.display();
    }
}