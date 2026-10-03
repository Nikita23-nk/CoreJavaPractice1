package assignment2;

import java.util.Scanner;

public class Qest10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int sum=0;
		int product=1;
		
		while(n>0) {
			int digit = n%10;
			sum = sum+digit;
			product=product*digit;
			n=n/10;
			
		}
		int result = product-sum;
		System.out.println("Result : "+result);
		
	}

}
