public class Class2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Suraj",11, 12000);
        Employee emp2 = new Employee("Nikhil",12, 17500);

        emp1.getInfo();
    }
}

class Employee{
    String name;
    int id;
    float sal;

    public void getInfo(){
        System.out.println(this.name + " with ID: " + this.id + "has " + this.sal);
    }
    Employee(String name, int id, float sal){
        this.name = name;
        this.id = id;
        this.sal = sal;
    }

}