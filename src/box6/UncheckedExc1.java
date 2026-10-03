package box6;

import java.util.Scanner;

public class UncheckedExc1 {
	public static void bhagakar(int a , int b) throws ArithmeticException {
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		System.out.println("Main start");
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number");
		int b = sc.nextInt();
		
		try {
			bhagakar(a,b);
		}catch(ArithmeticException a1){
			System.out.println("Bawlat Zero se divided mat kar");
		}finally {
			sc.close();
			System.out.println("ThankYou for visiting ,Come again");
		}
		System.out.println("Main end");
		
	}

}
