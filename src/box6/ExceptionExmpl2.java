package box6;

import java.util.Scanner;

public class ExceptionExmpl2 {
	public static void main(String[] args) {
		System.out.println("code start");
		String str = "Karan";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index of the char you like to print");
		int n = sc.nextInt();
		try {
			System.out.println(str.charAt(n));
		}catch(StringIndexOutOfBoundsException s1) {
			System.out.println("Index ke bahar ja raha hai");
		}
		System.out.println("code end");
	}

}
