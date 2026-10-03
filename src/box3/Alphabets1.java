package box3;

public class Alphabets1 {

	public static void main(String[] args) {
		//print alphabets with ASCII value
		for(int i=1, j=65;i<=26 && j<=90 ;i++ ,j++)
		{
			System.out.println( i + " = " +(char)j + " -> " + j);
		}
		
		System.out.println("...................");
		System.out.println("...................");
		//Different method
		int n=1;
		for(int i=65;i<=90;i++)
		{
			System.out.println(n +" = "+(char)i+" -> "+i);
			n++;
		}
		System.out.println("...................");
		System.out.println("...................");
		
		//Small letters with ASCII value
		int m=1;
		for(int i=97;i<=122;i++)
		{
			System.out.println(m+ " = "+(char)i+" -> "+i);
			m++;
		}
	}

}
