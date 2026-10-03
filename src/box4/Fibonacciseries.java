package box4;

public class Fibonacciseries {
	public static void main(String[] args) {
		//WAJP to print Fibonacci series
		// 0 1 1 2 3 5 8 13 21 34 55 89 ............
		
	   int n1=0;
	   int n2=1;
	   int limit=10;
	   
	   System.out.print(n1+" "+n2+" ");
	   
	   for(int i=3; i<=limit;i++) {
		   int n3=n1+n2;
		   System.out.print(n3+" ");
		   n1=n2;
		   n2=n3;
		   
	   }
		
	}

}
