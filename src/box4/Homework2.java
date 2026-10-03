package box4;

public class Homework2 {

	public static void main(String[] args) {
		// write a java program to print numbers which are divisible by 6 from 100 to 130 by using while and do while loop
         int i=100;
         
    /*     while(i<=130)
         {
              if(i%6==0)
              {
              System.out.println(i);
              }
              i++;
              
         } */
         
         do {
        	 if(i%6==0)
        	 {
        		 System.out.println(i);
        	 }
        	 i++;
        	 
         }while(i<=130);
	}

}
