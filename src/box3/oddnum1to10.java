package box3;

public class oddnum1to10 {
          //print odd numbers from 1 to 10
	public static void main(String[] args) {
		for(int i=1;i<=10;i+=2)
		{
			System.out.println(i);
		}
		System.out.println(".....................");
		for(int i=1; i<=20 ; i+=2)
		{
			System.out.println(i);
		}
		System.out.println("....................");
		
		for(int i =1 ; i<=20 ; i++)
		{
			if(i%2==1) {
				System.out.println(i);
			}
		}
	}

}
