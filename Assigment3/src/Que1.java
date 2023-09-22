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
    private int fee;
    CheckingAccount(long accountNumber, double totalBalance, int fee) {
        super(accountNumber, totalBalance);
        this.fee = fee;
    }

    public void deductFee() {
        super.withdraw(fee);
    }
}

// Derived Class: Saving Account
class SavingAccount extends BankAccount{
    private float interestRate;

    SavingAccount(long accountNumber, double totalBalance, float interestRate) {
        super(accountNumber, totalBalance);
        this.interestRate = interestRate;
    }

    public void addInterest(){
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
    }
}

//Main class
public class Que1 {

    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(12345, 30000, 8);

        System.out.println("Saving Account Balance: $" + savingAccount.getBalance());

        savingAccount.deposit(5000);

        System.out.println("Saving Account Balance after deposit: $" + savingAccount.getBalance());

        savingAccount.addInterest();

        System.out.println("Saving Account Balance after interest addition: $" + savingAccount.getBalance());
    }
}
