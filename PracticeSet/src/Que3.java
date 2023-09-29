
public class Que3 {
public static void main(String[] args) {
	for(int i=1;i<1000;i++) {
		if(isPalindrome(i)) {
			System.out.println(i);
		}
	}
}

public static boolean isPalindrome(int num) {
	int dup = num;
	int rev = 0;
	while(num != 0) {
		int temp = num%10;
		num/=10;
		rev = (rev*10)+temp;
	}
	return dup == rev;
}
}
