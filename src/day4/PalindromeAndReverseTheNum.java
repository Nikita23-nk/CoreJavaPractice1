package day4;

import java.util.Scanner;

public class PalindromeAndReverseTheNum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if it is palindrome");
		int num = sc.nextInt();
		int original = num;
		int rev = 0;
		while(num>0){
			int rem =  num%10;
			rev = (rev*10)+rem;
			num = num/10;
		}
		System.out.println("Reverse number is "+rev);
		if(original == rev) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not  palindrome");
		}
		
		
	}
	

}
