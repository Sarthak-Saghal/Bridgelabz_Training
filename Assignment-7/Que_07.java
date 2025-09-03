public class Que_07 {
    
    String accountHolder;
    int accountNumber;
    double balance;

 
    Que_07(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

   
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
        System.out.println("-----------------------------");
    }



    public static void main(String[] args) {
      
        Que_07 obj1 = new Que_07("Ravi Kumar", 12345, 5000);

    
        obj1.displayBalance();
        obj1.deposit(2000);
        obj1.withdraw(1500);
        obj1.withdraw(7000);  
        obj1.displayBalance();
    }


}
