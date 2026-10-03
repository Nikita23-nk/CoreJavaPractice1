package box9;

public class Str_ImpMethods {
	public static void main(String[] args) {
		String s = "Hello World";
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(4));
		System.out.println(s.length());
		System.out.println(s.equals("helllle"));
		System.out.println(s.equalsIgnoreCase("hEllo world"));
		System.out.println(s.isEmpty());
		System.out.println(s.indexOf("World"));
		System.out.println(s.replace('a', 'e'));
		System.out.println("  baby  ".trim());
		System.out.println(s.startsWith("Hel"));
		System.out.println(s.endsWith("ld"));
		System.out.println(s.concat(" My Name is NIKITA"));
		
	}
}
