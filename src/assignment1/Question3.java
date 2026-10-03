package assignment1;

import java.util.Scanner;

public class Question3 {
	
	public static void main(String[] args) {
		// WAJP to input principal ,time,and rate (P,T,R)from the user and find simple interest 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value for principal: ");
		double P = sc.nextDouble();
		
		System.out.println("Enter a value for Time : ");
		int T = sc.nextInt();
		
		System.out.println("Enter a value for Rate : ");
		int R = sc.nextInt();
		
		double Ans = (P*T*R)/100 ;
		
		System.out.println("The Simple Interest of the given data is : " +Ans);
		
		
	}

}
