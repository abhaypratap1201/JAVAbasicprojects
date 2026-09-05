import java.util.Scanner;

class ATM {

    private int pin = 1234;
    private double balance = 10000;

    // PIN check
    boolean checkPin(int enteredPin) {
        return enteredPin == pin;
    }

    // Withdraw
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        }
        else if (amount > balance) {
            System.out.println("Insufficient Balance");
        }
        else {
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Withdrawn Amount: " + amount);
        }
    }

    // Deposit
    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        }
        else {
            balance = balance + amount;
            System.out.println("Deposit Successful");
            System.out.println("Deposited Amount: " + amount);
        }
    }

    // Display Balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class ATMProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ATM atm = new ATM();

        int attempts = 0;
        boolean loggedIn = false;

        // Maximum 3 PIN attempts
        while (attempts < 3) {

            System.out.print("Enter PIN: ");
            int enteredPin = sc.nextInt();

            if (atm.checkPin(enteredPin)) {
                System.out.println("PIN Correct");
                System.out.println("Login Successful");
                loggedIn = true;
                break;
            }
            else {
                attempts++;
                System.out.println("Incorrect PIN");

                if (attempts < 3) {
                    System.out.println("Attempts Left: " + (3 - attempts));
                }
            }
        }

        // 3 times wrong PIN
        if (!loggedIn) {
            System.out.println("Your account is blocked!");
            return;
        }

        // ATM Menu
        int choice;

        do {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    atm.deposit(depositAmount);
                    break;

                case 3:
                    atm.displayBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using ATM");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}