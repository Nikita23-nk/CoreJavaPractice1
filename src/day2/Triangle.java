package day2;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter angles to make a triangle");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
	    double  c = sc.nextDouble();
		
		double triangle = 180;
		
		if(a+b+c == triangle) {
			System.out.println("This is a triangle");
		}else {
			System.out.println("Not a triangle");
		}
		
		
	}

}
