
public class Que12 {
public static void main(String[] args) {
//	12.Write a Java program to find the maximum and minimum value of an array.
	int arr[] = {2,6,1,10,15,0};
	
	int min = arr[0], max = arr[0];
	
	for(int i = 0; i< arr.length; i++) {
		if(arr[i] < min) {
			min = arr[i];
		}
		if(arr[i] > max) {
			max = arr[i];
		}
	}
	System.out.print("Min:" + min + "; Max: " + max);
	
}
}
