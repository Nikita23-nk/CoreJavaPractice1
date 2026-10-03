package box6;

import java.util.Scanner;

public class ExceptionsExmpl1 {
	public static void main(String[] args) {
		System.out.println("Bhiwandi");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int n1 = sc.nextInt();
		System.out.println("Enter 2nd number");
		int n2 = sc.nextInt();
		
		try {
			System.out.println(n1/n2);
		}catch(ArithmeticException a1){
			System.out.println("Gadhava zero ne divide ny hot");
		}
		System.out.println("Thane");
	}

}
