// CODSOFT TASK NO. 3 -> ATM INTERFACE

package atm;

public class Atm {
    int balance = 0;

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn, " + balance + " left.");
        } else if (balance < amount) {
            System.out.println("Insufficient balance, (" + balance + " left)");
        } else {
            System.out.println("Invalid input.");
        }
    }

    public void deposit(int amount) {
        if (amount >= 0) {
            balance += amount;
            System.out.println(amount + " deposited, " + balance + " balance");
        } else if (amount < 0) {
            System.out.println("Amount cannot be negative");
        }
    }

    public void viewBalance() {
        System.out.println("Current balance: " + balance);
    }

    public void exitBank() {
        System.out.println("Goodbye.");
    }
}
