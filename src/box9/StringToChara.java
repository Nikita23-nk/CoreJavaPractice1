package box9;

public class StringToChara {
	public static void main(String[] args) {
		String s = "Hello World";
		
		System.out.println(s);
		System.out.println("...............");
		System.out.println(s.charAt(0));
		System.out.println("----------------");
		char[] arr = s.toCharArray();
		  
		for(int i=0;i<arr.length;i++) {
			char c = arr[i];
			System.out.println(c);
		}
	}

}
