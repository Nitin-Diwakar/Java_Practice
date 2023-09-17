public class SelectionSort {
    public static void printArray(int[] arr){
        for(int i = 0; i< arr.length;i++)
            System.out.print(arr[i]+ " ");
    }
    public static void main(String[] args){
        int[] arr = {7,8,3,1,2};

        for(int i = 0; i< arr.length-1; i++){
            int min = i;
//            int index = i;
            for(int j = i+1; j< arr.length; j++){

                if(arr[min] > arr[j]) {
//                    min = arr[j];
                    min = j;
                }
            }
//            System.out.println(min);
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        printArray(arr);
    }
}
