package selfstudyoops;

public class StaticNonStatic {
	
	 static int i = 23;       //Static variable       
     int j = 34;                 //Non Static variable
     
     static void games() {         //  Static method
    	 System.out.println("playing games");
     }
     
     void video() {                  //Non Static method
    	 System.out.println("I prefer Youtube for videos");
     }
	
	
	
	public static void main(String[] args) {
		System.out.println("Main Start");
		int i = 24;     //local variable
		System.out.println(i);
		games();          //method calling
 //    video();           error: non-static method video() cannot be referenced from a static context
		System.out.println("Main Start");
		
	}

}
