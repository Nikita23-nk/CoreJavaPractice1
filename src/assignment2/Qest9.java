package assignment2;

import java.util.Scanner;

public class Qest9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num ;
		int max = Integer.MIN_VALUE;
		 System.out.println("Enter the numbers (0 to stop)");
		while(true) {
			num = sc.nextInt();
			if(num==0) {
				break;
			}
			if(num>max) {
				 max=num;
			}
			}
		System.out.println("Largest number = "+max);
	}

}
