import java.util.*;
class Student {
    int id;
    String name;
    int mark;
    String result;

    public void readInfo() {
    	Scanner in = new Scanner(System.in);
    	System.out.print("Enter ID: ");
        this.id = in.nextInt();
        in.nextLine();
        System.out.print("Enter Name: ");
        this.name = in.nextLine();
        System.out.print("Marks: ");
        this.mark = in.nextInt();
        System.out.println();
    }

    public void findResult() {
        if (mark >= 40) {
            result = "Pass";
        } else {
            result = "Fail";
        }
    }

    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Marks Obtained: " + mark);
        System.out.println("Result: " + result);
    }
}

public class Que3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.readInfo();
        student1.findResult();
        student1.displayDetails();

        System.out.println();

        Student student2 = new Student();
        student2.readInfo();
        student2.findResult();
        student2.displayDetails();
    }
}
