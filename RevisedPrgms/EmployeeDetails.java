class Employee {
    int id;
    String name;
    double salary;
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void show() {
        System.out.println(id + " " + name + " " + salary);
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        Employee e = new Employee(101, "John", 50000);
        e.show();
    }
}