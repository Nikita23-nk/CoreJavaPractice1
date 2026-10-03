package box2;

public class Maxof3num {
	public static void main(String[] args)
	{   //nikita
		int num1 = 200, num2 = 30,  num3 = 60 ;
		if(num1 >= num2 && num1 >= num3) {
			System.out.println( num1+ " is Maximum number");
		}
		else if(num2 >= num1 && num2 >= num3) {
			System.out.println(num2+ " is Maximum number");
		}
		else {
			System.out.println(num3+ " is Maximum number");
		}
	}

}
