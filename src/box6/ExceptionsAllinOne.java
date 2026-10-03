package box6;

import java.util.Scanner;

public class ExceptionsAllinOne {
	public static void main(String[] args) {
		System.out.println("code start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		
		String str = "Bhushan";
		int[] arr = {12,34,56,43,55,23,53,56,89,34,67};
		
		try {
			System.out.println(arr[n]);
			System.out.println(str.charAt(n));
			System.out.println(18/n);
		}catch(ArithmeticException a1) {
			System.out.println("Gadhav zero se divide mat kr");
		}catch(StringIndexOutOfBoundsException s1) {
			System.out.println("Index se bahar mat ja");
		}catch(ArrayIndexOutOfBoundsException b1) {
			System.out.println("Terrece pe ja raha hai");
		}catch(Exception e1) {
			System.out.println("Kuch to gadbad hai daya");
		}
		System.out.println("code end");
		
	}

}
