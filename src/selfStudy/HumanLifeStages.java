package selfStudy;

import java.util.Scanner;

public class HumanLifeStages {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of the Human");
		int age = sc.nextInt();
		if(age > 0 && age <=  5 ) {
			System.out.println("Human is infant");
		}
		else if(age > 5 && age <= 12) {
			System.out.println("Human is Child ");
		}else if(age > 12 && age <= 18) {
			System.out.println("Human is teenager");
		}else if(age > 18 && age <= 50) {
			System.out.println("Human is adult");
		}else if(age > 50 && age <= 120 ) {
			System.out.println("Human is Senior");
		}else {
			System.out.println("Bas krrr aur kitna jiyegaaaa");
		} sc.close();
	}

	

}
