package box6;

public class CheckedInterruptedExc {
	//Checked Exception Interrupted Exception 
	public static void main(String[] args) {
		System.out.println("Main start");
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		
		try {
			Thread.sleep(350);
		}catch(InterruptedException e) {
			System.out.println("Handled");
		}
		}
		System.out.println("Main end");
		
	}
	

}
