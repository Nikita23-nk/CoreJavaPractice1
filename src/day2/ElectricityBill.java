package day2;

public class ElectricityBill {
	public static void main(String[] args) {
		double unit = 20;
		
		if(unit>=0 && unit<=100) {
			double bill = unit * 5;
			System.out.println(" 5rs per unit ");
			System.out.println(bill+" is the total bill");
		}else if(unit >=101 && unit <= 200) {
			double bill = unit * 7;
			System.out.println(bill+" is the total bill");
			System.out.println(" 7rs per unit ");
		}else if(unit > 200) {
			double bill = unit * 10;
			
			System.out.println(bill+" is totall bill");
			System.out.println(" 10rs per unit ");
		}else {
			System.out.println("invalid data");
		}
	}

}
