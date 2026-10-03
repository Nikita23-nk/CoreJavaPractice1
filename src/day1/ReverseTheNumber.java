package day1;

public class ReverseTheNumber {
	public static void main(String[] args) {
		int num = 123;
		int rev = 0;
		int rem = 0;
		
		while(num > 0) {
			rem = num % 10;
			rev = rem + rev *10;
			num = num / 10;
			
		}
		System.out.println(rev+ " is the Reverse number ");
		
	}

}
