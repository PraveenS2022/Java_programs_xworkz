import java.util.Scanner;

public class BankAccountSystem {
    static class Account {
        int accountNumber;
        String holderName;
        double balance;

        Account(int accNo, String name, double bal) {
            accountNumber = accNo;
            holderName = name;
            balance = bal;
        }

        void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }

        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient Balance.");
            }
        }

        void display() {
            System.out.println("Account No: " + accountNumber + ", Name: " + holderName + ", Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account(101, "John Doe", 1000.0);

        int choice;
        do {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Display\n4. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    acc.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    acc.withdraw(sc.nextDouble());
                    break;
                case 3:
                    acc.display();
                    break;
            }
        } while (choice != 4);
        sc.close();
    }
}