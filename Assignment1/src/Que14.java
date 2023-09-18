
public class Que14 {
//	14.Write a Java program to find the second largest element in an array.
	public static void main(String[] args) {
		int arr[] = {5,2,1,6,7,3};
		
		sortArray(arr,arr.length);
		System.out.print(arr[arr.length-2]);
	}
//	[5,2,1,6,7,3]
	public static void sortArray(int arr[], int len) {
		for(int i = 0;i< len; i++) {
			for(int j = i+1; j < len; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp; 
				}
			}
		}
	}
}
