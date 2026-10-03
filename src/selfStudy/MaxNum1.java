package selfStudy;

public class MaxNum1 {
	public static void main(String[] args) {
	int a = 10;
	int b = 36;
	int c = 78;
	if(a > b) {
		if(a > c) {
			System.out.println(a+" is maximum");
		}
		else {
			System.out.println(c+" is maximum");
		}
		
	}else {
		if(b > c) {
			System.out.println(b+" is maximum");
		}else {
			System.out.println(c+" is maximum");
		}
	}
}
}