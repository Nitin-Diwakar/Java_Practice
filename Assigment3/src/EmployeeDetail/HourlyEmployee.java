package EmployeeDetail;

public class HourlyEmployee extends Employee {
    public double wage;
    public double hours;

    // Hourly = Salary per year / (Hours per week × Weeks per year)
    HourlyEmployee(String name, String ssn, double salary, double wage, double hours) {
        super(name, ssn, salary);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double salary() {
        // Hourly = Salary per year / (Hours per week × Weeks per year)
        return wage * hours;

    }

    public String toString() {
        return "Extra Hours salary:$" + salary();
    }
}
