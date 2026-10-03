package assignment2;

import java.util.Scanner;

public class Qest6 {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	//Input the number and print all the factors of that number
	int fact = 1;
	System.out.println("Enter the number for Factorial: ");
	int num = sc.nextInt();
	for(int i=1; i <= num ;i++) {
		
		fact*=i; //fact = fact*i
	}
	System.out.println("Factorial of a "+num + " is "+fact);
    sc.close();
}
}
