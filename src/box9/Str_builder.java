package box9;

public class Str_builder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(20);
		
		//StringBuilder (int capacity)
		sb.append("Hello");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.append(" hey my name is niiki  ");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb);
	}

}
