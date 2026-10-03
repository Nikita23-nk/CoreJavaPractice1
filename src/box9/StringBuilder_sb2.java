package box9;

public class StringBuilder_sb2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		//String builder constructor without argument
		sb.append("Hello");
		System.out.println("-----------------");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println("-----------------");
		sb.append(" World");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println("-----------------");
		sb.append(", Welcome to java class ...");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println("-----------------");	
	}
}
