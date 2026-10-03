package assignment1;

public class Question8 {
     public static void main(String[] args) {
    	 
    	 String str = "non";
    	 String rev = " ";
    	 System.out.println(str.length());
    	 
    	 for(int i=0;i<str.length();i++) {
    		 rev=str.charAt(i)+rev;
    	 }
    	 System.out.println("Reverse is "+rev);
    	 
    	 if(str.equalsIgnoreCase(rev)) {
    		 System.out.println(str+" is palindrome");
    	 }else {
    		 System.out.println(str+" is not palindrome");
    	 }
    	  
    	 
}
}
