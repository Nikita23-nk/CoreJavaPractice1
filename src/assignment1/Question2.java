package assignment1;

import java.util.Scanner;

public class Question2 {
	
	public static void main(String[] args) {
		
		//WAJP to print whether the number is even or odd 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println(num + " is Even Number");
		}
		else {
			System.out.println(num + " is Odd Number");
		}
		
	}

}
