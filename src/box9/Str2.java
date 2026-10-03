package box9;

public class Str2 {
	public static void main(String[] args) {
		String s1 = new String();  //empty string object 
		s1 = s1.concat("Hello");
		System.out.println(s1);
		
		String s2 = new String ("Hello World");
		System.out.println(s2);
		
		char[] chars = {'B','y','e',' ','W','o','r','l','d'};
		String s3 = new String(chars);
		
		System.out.println(s3);
	}

}
