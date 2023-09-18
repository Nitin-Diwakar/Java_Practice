import java.util.Scanner;

public class Que9 {
public static void main(String[] args) {
//	9.Write Java Program  to  Find Largest of Three Numbers
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter num1: ");
	int a = input.nextInt();
	System.out.print("Enter num2: ");
	int b = input.nextInt();
	System.out.print("Enter num3: ");
	int c = input.nextInt();
	
	if(a > b && a >c) {
		System.out.print("Largest number is: " + a);
	}
	else if(b > a && b > c) {
		System.out.print("Largest number is: " + b);
	}
	else {
		System.out.print("Largest number is: " + c);
	}
}
}
