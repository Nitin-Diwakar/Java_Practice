// Super class: Emplyoee
class Employee{
    protected int  SSN;
    protected String FirstName;
    protected String LastName;

    // Parameterized constructor
    Employee(int SSN, String FirstName, String LastName){
        this.SSN = SSN;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }
    public int getSSN(){
        return SSN;
    }
    public void setSSN(int SSN){
        this.SSN = SSN;
    }
    public String getFirstName(){
        return FirstName;
    }
    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }
    public String getLastName(){
        return LastName;
    }
    public void setLastName(String LastName){
        this.LastName = LastName;
    }
}

// ====================================
// Derived Class: Hourly Employee
class HourlyEmployee extends Employee{
    private float Salary;

    HourlyEmployee(int SSN, String FirstName, String LastName) {
        super(SSN, FirstName, LastName);
    }

    public void computeGrossPay(){}
    public void computeNetPay(){}
    public float getSalary(){
        return Salary;
    }
    public void setSalary(float Salary){
        this.Salary = Salary;
    }
    public void print(){
        /* Employee Hourly Salary */
    }


}

// ====================================
// Derived class: Salaried Employee
class SalariedEmployee extends Employee{
    private float Salary;

    SalariedEmployee(int SSN, String FirstName, String LastName) {
        super(SSN, FirstName, LastName);
    }
    public void computeGrossPay(){}
    public void computeNetPay(){}
    public float getSalary(){
        return Salary;
    }
    public void setSalary(float Salary){
        this.Salary = Salary;
    }
    public void print(){
        // display Annual salary of emp
    }
}

// ====================================
//main class
public class Que2 {
    public static void main(String[] args) {

    }
}
