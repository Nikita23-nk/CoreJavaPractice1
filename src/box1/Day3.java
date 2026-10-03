package box1;

public class Day3 {
     //Logical Operator
	public static void main(String[] args) {
		int a = 70;
		int b = 90;
		System.out.println((a>b) && false);  //false
		System.out.println(('a' == 97) && "Prem"=="prem");  //false
		System.out.println(('A'==65) && "Savita" != "Smit");    //true
		System.out.println((true==true) || (90+100)> (40*4));   //true
		System.out.println(!("Prashil"=="old-monk"));   //true
		
	}

}
