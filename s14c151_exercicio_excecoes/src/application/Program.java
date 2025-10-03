package application;

import model.entities.Account;
import model.exceptions.BalanceException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        try {
            // SETUP
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            // ENTERING INFO'S FOR ACCOUNT
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();
            System.out.println();

            // CREATING OBJECT ACCOUNT WITH NAME "ACC"
            Account acc = new Account(number, holder, initialBalance, withdrawLimit);

            // DO WITHDRAW METHOD
            System.out.print("Enter amount for withdraw: ");
            double amountWithdraw = sc.nextDouble();
            acc.withdraw(amountWithdraw);

            System.out.println();
            System.out.printf("New balance: %.2f", acc.getBalance());

            sc.close();
        }
        catch(BalanceException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
    }
}
