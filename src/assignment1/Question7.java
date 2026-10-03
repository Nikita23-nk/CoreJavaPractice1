package assignment1;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 =0;
		int n2=1;
		System.out.println("Enter the nth number for Fibonacci ");
		int limit=sc.nextInt();
		   
		   System.out.print(n1+" "+n2+" ");
		   
		   for(int i=3; i<=limit;i++) {
			   int n3=n1+n2;
			   System.out.print(n3+" ");
			   n1=n2;
			   n2=n3;
		   }
	}

}
