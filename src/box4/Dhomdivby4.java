package box4;

public class Dhomdivby4 {

	public static void main(String[] args) {
		//WAJP to print the numbers which are divisible by 4 from 10 to 40 bu using while and do while loop
         int i=10;
         
         while(i<=40){
        	 if(i%4==0)
        	 {
        		 System.out.println(i);
        	 }
        	 i++;
         }
         
         System.out.println("...................");
         
         int j=10;
         
         do {
        	 if(j%4==0)
        	 {
        		 System.out.println(j);
        	 }
        	 j++;
         }while(j<=40);
        		 
        		 

	}

}
