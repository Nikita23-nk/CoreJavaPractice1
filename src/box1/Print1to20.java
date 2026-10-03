package box1;

public class Print1to20 {
	public static void main(String[] args) {
//  Write a Java program to print numbers from 1 to 20
//		
//		for(int i=1;i<=20;i++) {
//			System.out.println(i);
//		}

	
//	Write a Java program to find the sum of all even numbers from 1 to 100.
	int sum = 0;
	for(int j=1;j<=100;j++) {
		if(j%2==0) {
			sum = sum +j;
		}
	}
	System.out.println(sum);
}
}