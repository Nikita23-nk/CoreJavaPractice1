package selfstudyoops;

class Ninja{
	String color;
	int price;
	double speed;
}
public class DefaultInitalization {
	public static void main(String[] args) {
		Ninja n1 = new Ninja();
		System.out.println(".......Before........");
		System.out.println(n1.color);
		System.out.println(n1.price);
		System.out.println(n1.speed);
		n1.color = "Yellow";
		n1.price = 15;
		n1.speed = 180;
		
		System.out.println(".......After.......");
		System.out.println(n1.color);
		System.out.println(n1.price);
		System.out.println(n1.speed);
		
		Ninja n2 = new Ninja();
		System.out.println(".......Before........");
		System.out.println(n2.color);
		System.out.println(n2.price);
		System.out.println(n2.speed);
		n2.color = "Red";
		n2.price = 20;
		n2.speed = 160;
		System.out.println(".......After.......");
		System.out.println(n2.color);
		System.out.println(n2.price);
		System.out.println(n2.speed);
	}

}
