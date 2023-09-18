import java.util.Scanner;

public class Que3 {
//	3.Write a java program to reverse the given number.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input any digit: ");
		int num = input.nextInt();
		//123 
		int n =0;
		
		//Looping
		while(num != 0) {
			int rem = num%10; 
			n =n*10 + rem;
			num/=10;
		}
		System.out.print("Reverse: " + n);
	}
	
}
