package box4;

public class Swapwithouttemp {

	public static void main(String[] args) {
		// WAJP to Swap two numbers without temporary variable
		
		int x = 450;
		int y = 468;
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("Value of X is "+x);
		System.out.println("Value of y is "+y);
		
	}
}
