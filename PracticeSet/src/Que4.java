
public class Que4 {
	public static void main(String[] args) {
		for(int i = 0;i<10000;i++) {
			if(isSum(i)) {
				System.out.println(i);
			}
		}
	}
	
	static int factorial(int n) {
		if(n == 0)
			return 1;
		else
			return n*factorial(n-1);
	}
	
	static boolean isSum(int n) {
		int sum = 0;
		int dup = n;
		while(n !=0) {
			int temp = factorial(n%10);
			n/=10;
			sum+=temp;
		}
		return dup == sum;
	}
}
