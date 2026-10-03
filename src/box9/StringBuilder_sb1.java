package box9;

public class StringBuilder_sb1 {
	public static void main(String[] args) {
		String s1 = "Niki";
		String s2 = s1.concat("ta");
		
		System.out.println(s2);
		System.out.println(s1);
		System.out.println(s2==s1);
		
		StringBuilder sb1 = new StringBuilder ("Adi");
		StringBuilder sb2 = sb1.append(" Kedar");
		
		System.out.println(sb2);
		System.out.println(sb1);
		System.out.println(sb2==sb1);
	}

}
