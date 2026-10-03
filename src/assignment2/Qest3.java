package assignment2;

import java.util.Scanner;
        //Area of rectangle 
public class Qest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length ");
		double len = sc.nextDouble();
		System.out.println("Enter the width ");
		double wid = sc.nextDouble();
		double Area = len * wid;
		System.out.println("Area of Rectangle is : "+Area);
		sc.close();
		
	}

}
