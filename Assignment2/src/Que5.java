import java.util.*;
public class Que5 {
//    Write a Java program to create a class called player with name, age, country Name,
//            total run as instance member.
//    Create 5 player objects and write  instance method to display the
//    details of Player having more than 5000 as total run
    String name;
    int age;
    String country;
    int totalRun;

    Que5(String name, int age, String country, int totalRun){
        this.name = name;
        this.age = age;
        this.country = country;
        this.totalRun = totalRun;
    }

    public void displayDetails(){
        System.out.println("Name:" + name);
        System.out.println("Age: "+ age);
        System.out.println("Country: "+ age);
        System.out.println("Total Run: "+ totalRun);
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Que5[] players = new Que5[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter player detail " + (i+1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Country: ");
            String country = sc.nextLine();
            System.out.print("Total Runs: ");
            int totalRun = sc.nextInt();
            sc.nextLine();

            players[i] = new Que5(name,age,country,totalRun);
        }

        System.out.println("\nPlayer having more than 5000 as total run");
        for (int i = 0; i< players.length;i++) {
            if(players[i].totalRun > 5000)
                players[i].displayDetails();
        }
    }
}