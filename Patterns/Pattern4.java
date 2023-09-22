package Patterns;

public class Pattern4 {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 0; i <n;i++){
            for (int j = 1; j <= n-i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
