import java.util.Scanner;

public class Que6 {
//	6.Java Program to Print Right Triangle Star Pattern
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter digit(1-9): ");
		int n = input.nextInt();
		
		for(int i = 1; i<= n;i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
