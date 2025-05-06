class Account {
    String owner;
    double balance;
    Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance += amount;
    }
    void display() {
        System.out.println(owner + " balance: " + balance);
    }
}
public class BankAccount {
    public static void main(String[] args) {
        Account a = new Account("Emma", 1000);
        a.deposit(500);
        a.display();
    }
}