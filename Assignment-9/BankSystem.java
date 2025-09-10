import java.util.*;
    class BankAccount {
    
    static String bankName = "PNB Bank";
    private static int totalAccounts = 0;


    private final int accountNumber;

    
    
    private String accountHolderName;
    private double balance;

    
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;       
        
        this.accountHolderName = accountHolderName; 
        
        this.balance = balance;
        totalAccounts++; 
        
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts in " + bankName + ": " + totalAccounts);
    }


    public void displayAccountDetails() {
     
        if (this instanceof BankAccount) {
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
            System.out.println("Bank: " + bankName);
            System.out.println("----------------------------");
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(101, "Sarthak", 5000.0);
        BankAccount acc2 = new BankAccount(102, "Nitin", 7500.0);

        
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

        
        BankAccount.getTotalAccounts();
    }
}


