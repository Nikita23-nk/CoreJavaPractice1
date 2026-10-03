package box1;

public class CountNum {
	public static void main(String[] args) {
//		Write a Java program to count how many numbers from 1 to 100 are divisible by 3.
//		int count = 0;
//		for(int i=1;i<=100;i++) {
//			if(i%3==0) {
//				count ++;
//			}
//		}
//		System.out.println(count);


	
//	Write a Java program to find the sum of the digits of a number.
//	  int n = 1234;
//	  int sum = 0;
//	  
//	  while(n>0) {
//		  int digit = n %10;
//		  n = n/10;
//		  System.out.println(digit);
//		  sum = sum+digit;
//	  }
//	 System.out.println(sum);
	 
//		Write a Java program to count the number of digits in a number.
		int num = 3456789;
		int count = 0;
		while(num>0) {
			int digit = num % 10;
			num = num /10;
			count++;
		}
		System.out.println(count);
}	
}