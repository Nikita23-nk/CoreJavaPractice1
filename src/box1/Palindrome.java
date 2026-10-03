package box1;

public class Palindrome {
	public static void main(String[] args) {
		int num=1219;
		int rev = 0;
		int N = num;
		while(num>0) {
			int rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		System.out.println(rev);
		if(N==rev) {
			System.out.println("The number is Palindrome");
		}else {
			System.out.println("Number is not Palindrome");
		}
	}
}
