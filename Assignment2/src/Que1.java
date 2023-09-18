import java.util.*;
public class Que1 {
	//Create a class called Emp with data members empno, empname, 
	//designation, dept and salary and methods as readEmpData() 
	//(to read  values to data members) and displayEmpData() 
	//(to display data members values to the screen) create an employee 
	//instance and display its information.
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.readEmpData();
		e1.displayEmpData();
		e2.readEmpData();
		e2.displayEmpData();
	}
}

class Employee{
	
	int empno;
	String empname;
	String designation;
	float sal;
	
	public void readEmpData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your ID: ");
		sc.nextLine();
		System.out.print("Enter your Name: ");
		empname = sc.nextLine();
		System.out.print("Enter your Design: ");
		designation = sc.nextLine();
		System.out.print("Enter your salaray: ");
		sal = sc.nextFloat();
		}
	
	public void displayEmpData() {
		System.out.println("ID: " + this.empno);
		System.out.println("Name: " + this.empname);
		System.out.println("Designation: " + this.designation);
		System.out.println("Salary: " + this.sal);
		System.out.println();
	}
}
