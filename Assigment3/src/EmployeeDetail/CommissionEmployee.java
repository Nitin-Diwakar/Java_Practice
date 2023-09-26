package EmployeeDetail;

public class CommissionEmployee extends Employee {
    public double sales;
    public double commission;

    public CommissionEmployee(String name, String ssn, double salary, double sales, double commissionRate) {
        super(name, ssn, salary);
        this.sales = sales;
        this.commission = commissionRate;
    }

    @Override
    public double salary() {
        // salaey/month with a commission percentage of 1.5%
        double monthSal = salary / 12;
        return monthSal + commission * sales;
    }

    public String toString() {
        return "Updated monthly salary($"+(salary/12)+")with current sales $" + sales + " adding with " + commission
                + " % commission rate is $" + salary();
    }
}