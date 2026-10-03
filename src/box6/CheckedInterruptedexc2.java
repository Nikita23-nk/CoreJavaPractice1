package box6;

public class CheckedInterruptedexc2 {
	//Checked Exception Interrupted Exception
	public static void jadu() throws InterruptedException , ArithmeticException{
		for(int i=1; i<=10 ; i++) {
			System.out.println(i);
			Thread.sleep(350);
		}
	}
	public static void main(String[] args) {
		System.out.println("main start");
		try {
			jadu();
		}catch(InterruptedException e){
			System.out.println("Handled");
		}
		System.out.println("main end");
		
	}
       
}
