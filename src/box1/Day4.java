package box1;

public class Day4 {
          //Assignment operator
	public static void main(String[] args) {
		int a = 20;
		int b = 60;
		int c = 90;
		int d = 30;
		int e = 59;
		
		System.out.println(a+=50); //70
		System.out.println(b-=200); //-140
		System.out.println(c*=5);  //450
		System.out.println(d/=5);   //6
		System.out.println(e%=10);  //9
		System.out.println(".................");
		System.out.println(a);  //70
		System.out.println(b);  //-140
		System.out.println(c);   //450
		System.out.println(d);   //6
		System.out.println(e);   //9
		

	}

}
