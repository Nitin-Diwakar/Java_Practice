public class Recursion3 {
    public static boolean isSorted(int arr[],int idx){
        //base function
        if(idx == arr.length-1){
            return true;
        }

        // recursion
        if(arr[idx] < arr[idx+1])
            return isSorted(arr,idx+1);
        else
            return false;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,6,6,7,7};
        boolean res = isSorted(arr,0);
        System.out.print(res);
    }
}
