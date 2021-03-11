package comm.example;

import java.util.Scanner;

public class Bank1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int choice;
        boolean end = false;
        long balance = 0;
        String bankName = null;
        int AccountNumber = 0;
        String Name = null;
        do {
            System.out.println("Bank Application System - Select your choice");
            System.out.println("1.Enter Bank Details");
            System.out.println("2.Show Details");
            System.out.println("3. Deposit money");
            System.out.println("4. Withdraw money");
            System.out.println("5. Check balance");

            choice = in.nextInt();

            switch (choice) {
                case 0:
                    end = true;
                    break;
                case 1:

                    System.out.println("Enter your Bank Name:");
                    bankName = in.next();
                    System.out.println("Enter your Account Number");
                    AccountNumber = in.nextInt();
                    System.out.println("Enter your name:");
                    Name = in.next();
                    break;

                case 2: System.out.println("Bank Name:" + bankName+ "  ||  Acc No."+ AccountNumber+ "  ||  Name:" + Name);
                break;


                case 3:
                    float amount;
                    System.out.print("Amount to deposit: ");
                    amount = in.nextFloat();
                    if (amount <= 0)
                        System.out.println("Transaction failed!");
                    else {
                        balance += amount;
                        System.out.println("Rupees" + amount + " is deposited.");
                    }
                    break;
                case 4:
                    System.out.print("Amount to withdraw: ");
                    amount = in.nextFloat();
                    if (amount <= 0 || amount > balance)
                        System.out.println("transaction failed. Maintain minimum balance of rupees 1000");
                    else {
                        balance -= amount;
                        System.out.println("Rupees" + amount + " has been withdrawn.");
                    }
                    break;
                case 5:
                    System.out.println("Your balance:" + balance);
                    break;
                default:
                    System.out.println("Wrong choice.");
                    break;

            }

            System.out.println();

        } while (!end);

        System.out.println("Bye!");

    }
}
