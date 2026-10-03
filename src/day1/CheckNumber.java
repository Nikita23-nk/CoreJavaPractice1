package day1;

public class CheckNumber {
	public static void main(String[] args) {
		int num = 23456789;
		
		if(num > 0) {
			System.out.println(num+" is positive");
		}else if (num < 0) {
			System.out.println(num+" is negative");
		}else {
			System.out.println(num +" is zero ");
		}
	}

}
