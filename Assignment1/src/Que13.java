import java.util.*;
public class Que13 {
//	13. Write a Java program to reverse an array of integer values.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Total input: ");
		int n = input.nextInt();
		
		int[] arr = new int[n];
		System.out.print("Enter their value:\n");
		for(int i = 0;i<n;i++ )
		{
			arr[i] = input.nextInt();
		}
		reverseArr(arr,arr.length);

		
	}
	
	public static void reverseArr(int[] arr, int len) {
		int[] newArr = new int[len];
		
		int j = len-1;
		for(int i = 0; i < len; i++) {
			newArr[i] = arr[j--];
		}
		for(int i = 0; i<len;i++) {
			System.out.print(newArr[i]+ " ");
		}
	}
}
