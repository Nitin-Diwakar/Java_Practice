import java.util.Scanner;

public class Que5 {
//	Java Program to Calculate Simple Interest.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// User input
		System.out.print("Enter principle value(P): ");
		float p = input.nextFloat();
		System.out.print("Enter rate value(R): ");
		float r = input.nextFloat();
		System.out.print("Enter time(T): ");
		int t = input.nextInt();
		
		//SI formula
		float simpleInterest = (p*r*t)/100;
		
		// Output
		System.out.print("Simple Interst: " + simpleInterest);
	}
}
