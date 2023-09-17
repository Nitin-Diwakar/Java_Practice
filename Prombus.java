import java.util.Scanner;

public class Prombus {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i = 1; i<= n; i++){
            int spaces = n -i;
            for(int j = 1; j<= spaces; j++)
                System.out.print(" ");
            for(int j = 1; j <= n; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
