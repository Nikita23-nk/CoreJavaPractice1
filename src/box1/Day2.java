package box1;

public class Day2{         //Relational Operator
	public static void main(String[] args) {
		int x = 69;
		int y = 96;
		System.out.println(x>y);  //false
		System.out.println(y==(100-4)); //true
		System.out.println(x==(60+9)); //true
		System.out.println(5>10);    //false
		System.out.println("Akshay"=="akshay");  //false //java is case sensitive language
		System.out.println(70==80);   //false
		System.out.println('A'==80);    //false
		System.out.println(true == false);  //false
		System.out.println(false != false);   //false
		System.out.println(false == false);   //true
		System.out.println('A'==65);   //true //ASCII value(American Standard code for information interchange
	}
}