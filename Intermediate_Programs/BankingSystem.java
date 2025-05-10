import java.util.*;
class Account {
    int accNo;
    String holder;
    double balance;
    Account(int accNo, String holder, double balance) {
        this.accNo = accNo;
        this.holder = holder;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance += amount;
    }
    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
    }
    public String toString() {
        return accNo + " " + holder + " " + balance;
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        Account acc = new Account(101, "Praveen", 1000);
        acc.deposit(500);
        acc.withdraw(200);
        System.out.println(acc);
    }
}