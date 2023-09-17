import java.util.Scanner;

public class Main {

    public static void add(int a,int b){
        int c = a+b;
        System.out.println(c);
    }
    public static void main(String[] arg){
        int a,b;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        sc.close();
        add(a,b);
        System.out.println(name);
}
}