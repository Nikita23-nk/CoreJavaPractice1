package oopsInDetails;

public class CarDetails {
	public static void main(String[] args) {
		Car c1= new Car();
		c1.brand="BMW";
		c1.model="S700";
		c1.price=9000000.312;
		System.out.println(c1.brand+" "+c1.model+" "+c1.price);
		
		Car c2 = new Car();
		c2.brand="Breeza";
		c2.model="R380";
		c2.price=1100000.903;
		System.out.println(c2.brand+" "+c2.model+" "+c2.price);		
	}

}
class Car{
	String brand;
	String model;
	double price;
}