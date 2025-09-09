
class BankAccount {
    public String accountNumber;      // Public: accessible everywhere
    protected String accountHolder;   // Protected: accessible in subclass and package
    private double balance;           // Private: accessible only within this class

    // Constructor
    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public getter for balance
    public double getBalance() {
        return balance;
    }

    // Public setter for balance
    public void setBalance(double balance) {
        if(balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // Display account details
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
        System.out.println("----------------------");
    }
}

// Subclass
class SavingsAccount extends BankAccount {
    double interestRate; // in percentage

    SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    void displaySavingsAccount() {
        // Access public and protected members directly
        System.out.println("Account Number: " + accountNumber);    // public
        System.out.println("Account Holder: " + accountHolder);    // protected
        System.out.println("Balance: $" + getBalance());          // private via getter
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("----------------------");
    }
}

// Main class to test
public class BankSystem {
    public static void main(String[] args) {
        
        BankAccount acc1 = new BankAccount("A1001", "Sarthak", 1500.0);
        acc1.displayAccount();

        
        acc1.setBalance(2000.0);
        System.out.println("After updating balance:");
        acc1.displayAccount();

    
        SavingsAccount savAcc = new SavingsAccount("S2001", "Shubhum ", 5000.0, 3.5);
        savAcc.displaySavingsAccount();
    }
}


