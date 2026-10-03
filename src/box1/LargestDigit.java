package box1;

public class LargestDigit {
	public static void main(String[] args) {
//		int num = 58239;
//		int largest = 0;
//		while(num>0) {
//			int digit = num%10;
//			num = num/10;
//			if(digit > largest) {
//				largest = digit;
//		}
//	}	
//		System.out.println(largest +" is largest digit.");

		int num = 23467;
		int smallest = 9;
		while(num>0) {
			int digit = num % 10;
			num = num/10;
			if(digit<smallest) {
				smallest = digit;
			}
		}	
	System.out.println(smallest+" is the smallest number.");
	}
}
