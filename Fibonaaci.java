import java.util.Scanner;

public class Fibonaaci {
    public static void printFunc(int a, int b, int n){
        if(n == 0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFunc(b,c,n-1);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b =1;
        System.out.println(a);
        System.out.println(b);
        printFunc(a,b,n-2);
    }
}
