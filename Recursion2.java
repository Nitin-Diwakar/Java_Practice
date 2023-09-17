public class Recursion2 {
    public static int first = -1;
    public static int last = -1;
    public static void findOccurence(String str, int idx, char c){
        if(idx == str.length()){
            System.out.println("First: "+ first);
            System.out.println("Last: "+ last);
            return;
        }
        int current = str.charAt(idx);
        if(current == c){
            if(first == -1)
                first = idx;
            else
                last = idx;
        }
        findOccurence(str,idx+1,c);
    }
    public static void main(String[] args){
        String str = "abaacdaefaah"; //0-10
        findOccurence(str,0,'a');
    }
}
