package assignment1;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		// Take a name as input and print a greeting message for that particular name
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a name : ");
		String name = sc.next();
		
		System.out.println("Hello " +name+"! Good Morning.. Have A Greate Day...");
		
	}

}
