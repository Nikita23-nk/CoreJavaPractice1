package box1;

public class Ternaryopt1 {

	public static void main(String[] args) {
		int i = 45;
		int j = 55;
		int n = ((i+j <= 150 ) ? 786 : 420);   //786
		System.out.println(n);
		
		int res = (160 == 160 )? (60*5) : (100/5);  //300
		System.out.println(res);
	}

}
