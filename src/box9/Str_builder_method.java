package box9;

public class Str_builder_method {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello World");
		
		sb.insert(5, " hi");
		System.out.println(sb);
		
//		sb.reverse();
		System.out.println(sb);
		
		sb.delete(0, 5);
		System.out.println(sb);
		
		sb.replace(0,4," heyy");
		
		System.out.println(sb);
	}

}
