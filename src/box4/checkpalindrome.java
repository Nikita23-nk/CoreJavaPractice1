package box4;

public class checkpalindrome {

	public static void main(String[] args) {
		// WAJP  to print a number is Palindrome or not 
		
		int num=1771;
		int rev=0;
		int temp=num;
		
		while(num>0)
		{
			int rem=num%10;
			    rev=(rev*10)+rem;
			    num=num/10;
			    
		}
		System.out.println("Reverse number is "+rev);
		
		if(temp==rev)
		{
			System.out.println("Number is Palindrome ");
		}else {
			System.out.println("Number is not-Palindrome ");
		}
		

	}

}
