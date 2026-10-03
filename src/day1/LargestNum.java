package day1;

public class LargestNum {
	public static void main(String[] args) {
		int num1 = 234;
		int num2 = 3432;
		int num3 = 567;
		
		if(num1 > num2 || num1 > num3) {
			System.out.println(num1+" is the largest");
		}else if(num2 > num3 || num2 > num1 ) {
			System.out.println(num2 +" is largest");
		}else {
			System.out.println(num3+" is largest ");
		}
	}

}
