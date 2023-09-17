public class TowerOfHanoi {
    public static void printFunc(int n, String src,String aux,String des ) {
        if(n == 1){
            System.out.println("Transfer disk " + n + " from " + src + " to " + des);
            return;
        }
        printFunc(n-1, src,des,aux);
        System.out.println("Transfer disk " + n + " from " + src + " to " + des);
        printFunc(n-1,aux,src,des);
    }
    public static void main(String[] args){
        int n = 3;
        String src = "S";
        String des = "D";
        String aux = "A";
        printFunc(n,src,aux,des);
    }
}
