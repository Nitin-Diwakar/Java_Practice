class Account {
    int accno;
    String accname;
    double amount;

    // Constructor to initialize the account details
    public Account(int accno, String accname, double amount) {
        this.accno = accno;
        this.accname = accname;
        this.amount = amount;
    }

    // Method to withdraw a specified amount
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount <= 0) {
            System.out.println("Invalid amount for withdrawal.");
            return;
        }

        if (withdrawAmount > amount) {
            System.out.println("Insufficient balance.");
        } else {
            amount -= withdrawAmount;
            System.out.println(withdrawAmount + " withdrawn successfully.");
        }
    }

    // Method to deposit a specified amount
    public void deposit(double depositAmount) {
        if (depositAmount <= 0) {
            System.out.println("Invalid amount for deposit.");
            return;
        }

        amount += depositAmount;
        System.out.println(depositAmount + " deposited successfully.");
    }

    // Method to calculate and print interest
    public void interest() {
        double interestRate = 0.05; // Assuming 5% interest rate
        double interestAmount = amount * interestRate;
        System.out.println("Interest Amount: " + interestAmount);
    }
}

public class Que4 {
    public static void main(String[] args) {
        // Create an account object
        Account myAccount = new Account(1001, "John Doe", 1000.0);

        // Test withdraw method
        myAccount.withdraw(500); // Outputs: 500 withdrawn successfully.
        myAccount.withdraw(700); // Outputs: Insufficient balance.

        // Test deposit method
        myAccount.deposit(200);  // Outputs: 200 deposited successfully.

        // Test interest method
        myAccount.interest();    // Outputs: Interest Amount: 40.0
    }
}
