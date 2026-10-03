package box4;

import java.util.Scanner;
public class Homework {

	public static void main(String[] args) {
		
		 // Write a java program to print table of any number using while and do while loop by using Scanner input
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number to print a table");
		 int num = sc.nextInt();
		/* int j=1;
		 do
		 {
			 System.out.println( num +" X "+j +" = "+ num*j);
			 j++;
		 }while(j<=10);
		  */
		 
		 int i=1;
		 while(i<=10)
		 {
			 System.out.println(num +" X "+i +" = "+ num*i);
			 i++;
		 }

	}

}
