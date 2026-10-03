package selfstudyoops;

class Nano{
	String color;
	int price ;
	double mil;
	
	void jankari() {
		System.out.println("Nano color is "+color+" price is "+price+" milege is "+mil);
	}
	
}
public class BMW {
	public static void main(String[] args) {
		Nano n1 = new Nano();
		n1.jankari();
		n1.color="Black";
		n1.mil=232;
		n1.price = 5;
		System.out.println("..........");
		n1.jankari();
		System.out.println("..........");
		Nano n2 = new Nano();
		n2.jankari();
		
	}

}
