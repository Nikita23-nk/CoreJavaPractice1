package box3;

public class AlphabetwithAscii {

	public static void main(String[] args) {
		for(int i=65;i<=90;i++)
		{
			System.out.println((char)i + " -> " + i);
		}
		System.out.println(".................");
		System.out.println("..................");
		
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.println(ch+" -> "+ (int)ch);
		}

	}

}
