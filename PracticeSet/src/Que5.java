
public class Que5 {
	public static void main(String[] args) {
		for(int i=0;i < 1000;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	static boolean isPrime(int n) {
		int count = 0;
		for(int i=1;i<=n ;i++) {
			if(n%i == 0)
				count++;
		}
		if(count == 2)
			return true;
		return false;
	}
}
