import java.util.Scanner;

public class Que10 {
public static void main(String[] args) {
//	10.Java Program to Make a Simple Calculator Using switch...case
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter num 1: ");
	int a = input.nextInt();
	
	System.out.print("Enter num 2: ");
	int b = input.nextInt();
	
	System.out.print("Enter operator to perform calculation: ");
	char operator = input.next().charAt(0);
	int res;
	System.out.print("Calculation of given number is: ");
	switch(operator) {
	case '+': System.out.print(a+b); break;
	case '-': System.out.print(a-b);break;
	case '*': System.out.print(a*b);break;
	case '/': System.out.print(a/b);break;
	case '%': System.out.print(a%b);break;
	default: System.out.print("Invalid operator");
	}

	
}
}
