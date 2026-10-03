package box3;

//Scanner class program
//User input method
import java.util.Scanner;     //Step 1
public class UsingScannClss {

	public static void main(String[] args) {
		System.out.println("Main Start");
		Scanner sc = new Scanner(System.in);    //Step 2
		
		System.out.println("Enter the number to print the Table");
		int n = sc.nextInt();         //Step 3
		
	for(int i =1; i<=10;i++)
	{
		System.out.println(n+" X "+i+" = "+(n*i));
	}
		System.out.println("Main End");

	}

}
