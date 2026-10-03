package box6;

abstract class Jumanji //Abstract class
{
	int a;  //non static global variable
	
	public Jumanji(int a) { //constructor
		this.a = a;
		System.out.println("1 Inside jumanji sonst");
		
	}
	abstract void game();     //abstract method
}

class Rock extends Jumanji{
	
	int b;
	
	public Rock (int a,int b) {
		super(a);
		this.b = b;
		System.out.println("2 Inside rock const");
	}
	@Override
	void game() {
		System.out.println("playing games in jungle");
	}
}

public class Interface1 {
	public static void main(String[] args) {
		System.out.println("Main start");
		
		Rock r1 = new Rock(400,700);
		
		/* 
		 * Can abstract class have constructors ?
		 * -----> Yes     but it has to be invoked by the subclass-con either 
		 * implicitly or explicitly using super();           */
		System.out.println("Main end");
	}

}
