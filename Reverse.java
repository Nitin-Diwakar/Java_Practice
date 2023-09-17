import java.util.Scanner;

public class Reverse {
    public static void rev(String str, int idx){
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        rev(str,idx-1);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.next();
        rev(str, str.length()-1);
    }
}
