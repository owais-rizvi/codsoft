// CODSOFT TASK NO. 3 -> ATM INTERFACE

package atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Atm myAtm = new Atm();
        boolean bankRunning = true;
        System.out.println("WELOME TO THE ATM\n");
        while (bankRunning) {
            System.out.println("What would you like to do?");
            System.out.println("1.Withdraw\n2.Deposit\n3.Check Balance\n4.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to withdraw: ");
                    int amountToWithdraw = sc.nextInt();
                    myAtm.withdraw(amountToWithdraw);
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    int amountToDeposit = sc.nextInt();
                    myAtm.deposit(amountToDeposit);
                    break;
                case 3:
                    myAtm.viewBalance();
                    break;
                case 4:
                    myAtm.exitBank();
                    bankRunning = false;
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        }
        sc.close();
    }
}
