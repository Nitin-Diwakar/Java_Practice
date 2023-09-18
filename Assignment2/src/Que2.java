import java.util.Scanner;

class ElectricityBill {
    private int customerNumber;
    private String customerName;
    private int unitsConsumed;

    public void readData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer number: ");
        customerNumber = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter customer name: ");
        customerName = scanner.nextLine();

        System.out.print("Enter units consumed: ");
        unitsConsumed = scanner.nextInt();
    }

    public void showData() {
        System.out.println("Customer Number: " + customerNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
    }

    public double computeBill() {
        double billAmount = 0.0;

        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 1.20;
        } else if (unitsConsumed <= 300) {
            billAmount = 100 * 1.20 + (unitsConsumed - 100) * 2.00;
        } else if (unitsConsumed <= 600) {
            billAmount = 100 * 1.20 + 200 * 2.00 + (unitsConsumed - 300) * 3.00;
        } else {
            billAmount = 100 * 1.20 + 200 * 2.00 + 300 * 3.00 + (unitsConsumed - 600) * 5.00;
        }

        return billAmount;
    }
}

public class Que2 {
    public static void main(String[] args) {
        ElectricityBill customer = new ElectricityBill();
        customer.readData();

        double billAmount = customer.computeBill();

        System.out.println("\nCustomer Details:");
        customer.showData();
        System.out.println("Electricity Bill: Rs. " + billAmount);
    }
}
