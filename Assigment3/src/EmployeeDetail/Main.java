package EmployeeDetail;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", "123-45-6789", 50000);

        // Print information of employee1
        System.out.println("Employee 1:");
        System.out.println(employee1.toString());

        /* Update employee1's details
            Just for checking
        */
        employee1.name = "John Smith";
        employee1.ssn = "987-65-4321";
        employee1.salary = 60000;


        System.out.println("\nUpdated Employee 1:");
        System.out.println(employee1.toString());

        // CommissionEmployee operation
        CommissionEmployee commissionEmployee = new CommissionEmployee("Jane Smith", "987-65-4321", 60000, 100000, 0.015);
        System.out.println("\nCommission Employee Operation:");
        System.out.println(commissionEmployee.toString());

        // HourlyEmployee operation
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Bob Johnson", "567-89-0123", 40000, 20, 2000);
        System.out.println("\nHourly Employee Operation:");
        System.out.println(hourlyEmployee.toString());

        // SalariedEmployee operation
        SalariedEmployee salariedEmployee = new SalariedEmployee("Jane Smith", "987-65-4321", 60000, 10000);
        System.out.println("\nSalaried Employee Operation:");
        System.out.println(salariedEmployee.toString());
    }
}
