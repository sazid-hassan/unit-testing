package bankdemo;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Select Operation : \n1. Check Balance\n2. Deposit\n3. Withdraw\nPress Anything Else to Exit");
        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount();

        while (true)
        {
            int operator = scanner.nextInt();

            if (operator == 1)
            {
                System.out.println(account.getBalance());
            } else if (operator == 2) {
                System.out.println("Amount to deposit : ");
                double amount = scanner.nextDouble();

                account.deposit(amount);
            }else if (operator == 3) {
                System.out.println("Amount to withdraw : ");
                double amount = scanner.nextDouble();

                account.withdraw(amount);
            }
            else
            {
                System.out.println("Exiting!");
                break;
            }
        }
    }
}
