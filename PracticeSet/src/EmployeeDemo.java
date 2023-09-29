class Employee{
	String name;
	double salary;
	
	// default constructor
	Employee(){
		
	}
	
	// Parametric constructor
	Employee(String name,double salary){
		this.name = name;
		this.salary = salary;
	}
	
	public void printEmpDetails() {
		System.out.println(name);
		System.out.println(salary);
	}

}

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee("Harry Smith",1000);
		Employee e2;
		e1.printEmpDetails();
	}
}

