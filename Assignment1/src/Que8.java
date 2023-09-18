import java.util.Scanner;

public class Que8 {
//	8.Write a java program  to  print Table of given  Number 
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter number for Table generate: ");
	int n = input.nextInt();
	
	for(int i = 1; i<=10;i++) {
		System.out.println( n + "x" + i + "= " + (n*i));
	} 
}
}
