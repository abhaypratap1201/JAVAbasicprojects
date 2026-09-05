import java.util.*;

public class BankAccount {
    private int AccountNumber;
    private String AccountHolderName;
    private double Balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.AccountNumber = accountNumber;
        this.AccountHolderName = accountHolderName;
        this.Balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            Balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= Balance) {
            Balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
    public void displayBalance() {
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Account Holder Name: " + AccountHolderName);
        System.out.println("Balance: " + Balance);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number:");
        int accountNumber = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.println("Enter Account Holder Name:");
        String accountHolderName = sc.nextLine();

        System.out.println("Enter Initial Balance:");
        double initialBalance = sc.nextDouble();

        BankAccount account = new BankAccount(accountNumber, accountHolderName, initialBalance);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            sc.close();
        }
    }

    
}
