package selfstudyoops;
                  //Same class Same package
public class War {
	//non-static global variables
	public int a = 100;
	protected int b = 200;
	          int c = 300;
	private int d = 400;
	
	public void fight1() {
		System.out.println("Public Access Modifier");
	}
	
	protected void fight2() {
		System.out.println("Protected Access Modifier");
	}
	
	 void fight3() {
		System.out.println("pkg-leve Access Modifier");
	}
	
	private void fight4() {
		System.out.println("Private Access Modifier");
	}
	public static void main(String[] args) {
		System.out.println("Main started ");
	    War w1 = new War();
	    System.out.println(w1.a);
	    System.out.println(w1.b);
	    System.out.println(w1.c);
	    System.out.println(w1.d);
	    w1.fight1();
	    w1.fight2();
	    w1.fight3();
	    w1.fight4();
		System.out.println("Main Ended ");
		
	}
	

}
