package day3;

public class ReverseNum {
	public static void main(String[] args) {
		int num = 123;
		int rem = 0;
		int rev = 0;
		
		while(num>0) {
			rem = num % 10;
			rev = rem + rev*10;
			num = num / 10;
		}
		System.out.println(rev);
	}

}
