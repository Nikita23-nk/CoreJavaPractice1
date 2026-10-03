package assignment1;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		
	double Ans = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number : ");
	int num1 = sc.nextInt();
	
	System.out.println("Enter Second number : ");
	int num2 = sc.nextInt();
	
	System.out.println("Enter a operator : ");
	char oper = sc.next().charAt(0);
	
	System.out.println("Your Answer is : ");
	if(oper == '+') {
		System.out.println(Ans = num1 + num2);
	}else if(oper =='-') {
		System.out.println(Ans = num1 - num2);
	}else if(oper =='*') {
		System.out.println(Ans = num1 * num2);
	}else if(oper =='/') {
		System.out.println(Ans = num1 / num2);
	}else if(oper=='%') {
		System.out.println(Ans = num1 % num2);
	}else {
		System.out.println("Invalid Operator");
	}
	
	
	
	
	}	

}
