import java.util.*;
public class Ass2{
	public static void main(String[] args) {
//		Write a program to find SUM of a given digit
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter num: ");
		int a = input.nextInt();
		
		int sum = 0;
		while(a != 0) {
			int rem = a%10;
			sum+=rem;
			a/=10;
		}
		System.out.print("Sum of given digit is " + sum);
	}
}