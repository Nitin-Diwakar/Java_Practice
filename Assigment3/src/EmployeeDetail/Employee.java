package EmployeeDetail;

public class Employee {
    public String name;
    public String ssn;
    public double salary;

    // double salary;
    public Employee(String name, String ssn, double salary) {
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public double salary() {
        // Employee annual salary
        return salary;
    }

    public String toString() {
        return "Name:" + name + "; " + "SSN:" + ssn + "; Salary:$" + salary();
    }
}
