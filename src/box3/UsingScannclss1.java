package box3;

import java.util.Scanner;            //Step 1

public class UsingScannclss1 {

	public static void main(String[] args) {
		System.out.println("P start");
		Scanner sc = new Scanner(System.in);        // Step 2
		
		System.out.println("Enter Your Name");
		String name = sc.next();      //Step 3
		
		System.out.println("Enter Age");
        int age = sc.nextInt();          //Step 3
        
        System.out.println("Enter Your Gender");
        char gen = sc.next().charAt(0);       //Step 3
        
        System.out.println("Enter Your Percentage");
        double per = sc.nextDouble();        //Step 3
        
        System.out.println("................");
        System.out.println("Name of Person is "+name);
        System.out.println("Age is "+age);
        System.out.println("Gender is "+gen);
        System.out.println("Percentage is "+per);
        
        System.out.println("P End");
        
	}

}
