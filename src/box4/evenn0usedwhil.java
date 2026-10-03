package box4;

public class evenn0usedwhil {

	public static void main(String[] args) {
		// print even number by using do while
		int i=20;
		
		do {
			System.out.println(i);
			i+=2;
			
		}while(i<=30);
          System.out.println("..............");
          
          int j=20;
          
          do {
        	  if(j%2==0)
        	  {
        		  System.out.println(j); 
        	  }
        	  j++;        //increment should be written outside the brackets in if condition
          }while(j<=30);
          
	}

}
