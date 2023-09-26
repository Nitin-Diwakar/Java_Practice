package EmployeeDetail;

public class SalariedEmployee extends Employee {

    public double basicSalary;

    public SalariedEmployee(String name, String ssn, double salary, double basicSalary) {
        super(name, ssn, salary);
        this.basicSalary = basicSalary;

    }

    @Override
    public double salary() {
        return salary + basicSalary;
    }

    public String toString() {
        return "Name:" + name + "; " + "SSN:" + ssn + "; TotalSalary:$" + salary();
    }
}
