package selfstudyoops;

class Tarzon{
	String color = "Purple";
	int price = 15;
	int mil = 10;
	double bcap = 7.7;
}

public class Car {
	public static void main(String[] args) {
		Tarzon t1 = new Tarzon();
		Tarzon t2 = new Tarzon();
		
		t1.color ="white";
		t1.mil = 8;
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1.color);
		System.out.println(t1.price);
		System.out.println(t1.mil);
		System.out.println(t1.bcap);
		System.out.println(".....................");
		System.out.println(t2.color);
		System.out.println(t2.price);
		System.out.println(t2.mil);
		System.out.println(t2.bcap);
		
	
	}

}
