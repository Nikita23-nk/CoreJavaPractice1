package selfStudy;

import java.util.Scanner;

public class InstagramLoginPage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email id");
		String email = sc.next();
		System.out.println("Enter the Password");
		int password = sc.nextInt();          
		
		
		//String email ="kedarniki@gmail.com";
	//	int password = 7787;
		
		if( email.equals("kedarniki@gmail.com") ) {
			if (password == 7787) {
			System.out.println("login successful");
		}else {
			System.out.println("Invalide Password");
		
		}
		}
			else {
			System.out.println("Invalid emailid");
		}
		sc.close();
	}
	}


