package box4;

public class findnnaturnumb {

	public static void main(String[] args) {
		// WAJP to find sum of n natural numbers
		// sum(n)=n(n+1)/2
		 
		int n=10;
		int sum =0;
		
		for(int i=1; i<=n;i++)
		{
			
			sum+=i;     //sum=sum+i
		}
		System.out.println("sum of a " +n+" natural number is "+ sum);

	}

}
