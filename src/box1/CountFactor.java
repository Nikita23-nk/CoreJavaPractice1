package box1;

public class CountFactor {
	public static void main(String[] args) {
		int n=20;
		int sum = 0;
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				count++;
				sum=sum+i;	
			}	
		   	
	}
		System.out.println("...........................");
		System.out.println(count+" is the count of factors.");
		System.out.println("...........................");
		System.out.println(sum+" is the sum of the factors.");
	}
	}

