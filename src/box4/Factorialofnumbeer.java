package box4;

public class Factorialofnumbeer {

	public static void main(String[] args) {
		// WAJP to print Factorial of a number
		// 5! -> 5*4*3*2*1 = 120
		// 7! -> 1*2*3*4*5*6*7 = 
		
		int n=5;
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		System.out.println("Factorial of "+n+" numbers is " +fact);

	}

}
