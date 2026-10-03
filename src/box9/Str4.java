package box9;

public class Str4 {
	public static void main(String[] args) {
		String s1 = "Nikita";
		String s2 = "Nikita";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		StringBuilder sb = new StringBuilder();
		System.out.println(sb);
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.append(" D Y Patil College");
		System.out.println();
		
		StringBuilder sb1 = sb.append(" Pune");
		System.out.println(sb1);
		
		StringBuilder sb11 = new StringBuilder("Nikita");
		
		StringBuilder sb12 = new StringBuilder("Nikita");
		System.out.println(sb11==sb12);
		System.out.println(sb11.equals(sb12));
	}

}
