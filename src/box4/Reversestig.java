package box4;

public class Reversestig {

	public static void main(String[] args) {
		// Reverse the String
		String str="Nikita";
		String rev="";
		             // i<=str.length()-1
		for(int i=0; i<str.length() ;i++)
		{
			rev = str.charAt(i)+rev;
		}
		System.out.println("Reverse is "+rev);

	}

}
