package selfStudy;

public class MaxNum {
	public static void main(String[] args) {
		int a = 10;
		int b = 36;
		int c = 28;
		
		if(a > b || a > c) {
			System.out.println(a+" is maximum number");
		}else if(b > c) {
			System.out.println(b+" is maximum");
		}else {
			System.out.println(c+" is maximum");
		}
	}

}
