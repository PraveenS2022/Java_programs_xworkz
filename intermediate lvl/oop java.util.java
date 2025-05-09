import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + " | Name: " + name + " | Age: " + age);
    }

    public int getId() {
        return id;
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Student\n2. View All Students\n3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    studentList.add(new Student(id, name, age));
                    System.out.println("Student added successfully.");
                    break;
                case 2:
                    System.out.println("\nList of Students:");
                    for(Student s : studentList) {
                        s.displayDetails();
                    }
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while(choice != 3);

        scanner.close();
    }
}
