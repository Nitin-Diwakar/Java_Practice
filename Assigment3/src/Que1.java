//SuperClass: Bank Account
class BankAccount{
    private long accountNumber;
    private double totalBalance;

    BankAccount(long accountNumber,double totalBalance){
        this.accountNumber = accountNumber;
        this.totalBalance = totalBalance;
    }

    public void deposit(double amount){
        totalBalance += amount;
    }
    public void withdraw(double amount){
        if(totalBalance >= amount)
            totalBalance-=amount;
        else
            System.out.println("Insufficient Balance");
    }
    public double getBalance(){
        return totalBalance;
    }
}

//Derived class: Checking Account
class CheckingAccount extends BankAccount{
    int fee;

    CheckingAccount(long accountNumber, double totalBalance) {
        super(accountNumber, totalBalance);
    }

    public void deductFee() {

    }
}

// Derived Class: Saving Account
class SavingAccount extends BankAccount{
    float interestRate;

    SavingAccount(long accountNumber, double totalBalance) {
        super(accountNumber, totalBalance);
    }

    public void addInterest(){

    }
}

//Main class
public class Que1 {

    public static void main(String[] args) {
        BankAccount SBI12345 = new BankAccount(12345,20000);

        //getter method call
        System.out.println("Current Balance: " + "$" + SBI12345.getBalance());

        // deposit method call
        SBI12345.deposit(10000);
        System.out.println("Deposited $10000.0");

        //getter method call
        System.out.println("Current Balance: " + "$" + SBI12345.getBalance());

        SBI12345.withdraw(20000);
        System.out.println("Total amount after withdraw: "+ "$" + SBI12345.getBalance());
    }
}
