package box1;

public class CountOccurance {
	public static void main(String[] args) {
//		Write a Java program to count how many times a particular digit occurs in a number.
		int n = 1223452;
		int digit = 2;
		int count=0;
		while(n>0) {
			int num = n%10;
			n=n/10;
			if(num==digit) {
				count++;
			}	
		}
		System.out.println(count);
	}
}
