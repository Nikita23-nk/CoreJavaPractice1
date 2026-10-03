package assignment1;

import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		//transfer currency from Ruppes to USD
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the Rupees value : ");
		double Rupees = sc.nextDouble();
		
		double USD = Rupees /92;
		System.out.println(USD+ " dollars");
		
	}

}
