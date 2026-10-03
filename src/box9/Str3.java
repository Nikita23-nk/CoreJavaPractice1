package box9;

public class Str3 {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.charAt(0));
		//StringIndexOutOfBound Exception : Hello index exists only 4th no of index ,so th 10th index is out of  bound thats why exception occurs
	
		System.out.println(s1.length());
	
	}

}
