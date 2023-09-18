import java.util.Scanner;

public class Que4 {
//	4.Java Program to Check Whether a Number is Even or Odd
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.print("Input any digit: ");
		int num = input.nextInt();
		
		if(num%2 == 0)
			System.out.print(num +" is even.");
		else
			System.out.print(num +" is odd.");
	}
}
