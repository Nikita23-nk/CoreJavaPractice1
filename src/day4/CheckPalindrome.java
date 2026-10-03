package day4;

public class CheckPalindrome {
	public static void main(String[] args) {
		int num = 232;
		int original = num;
		int rev= 0;
		
		while(num>0) {
			int rem = num %10;
			rev = (rev*10)+rem;
			num = num/10;
		}
		System.out.println(rev);
		if(original==rev) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not palindrome");
		}
	}

}
