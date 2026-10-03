package selfStudy;

import java.util.Scanner;

public class FoodPrice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String food = sc.next();
		if(food.equals("Pizza") || food.equals("pizza")) {
			System.out.println(food+" Price is 500");
		}else if(food =="Coffee" || food =="coffee") {
			System.out.println(food+" Price is 100");
		}else if(food =="Burger" || food =="burger") {
			System.out.println(food+" Price is 200");
		}else if(food =="Tea" || food =="tea") {
			System.out.println(food+" Price is 20");
		}else if(food =="Mocktail" || food =="mocktail") {
			System.out.println(food+" Price is 80");
		}else {
			System.out.println("This item is not available");
		}
	}

}
