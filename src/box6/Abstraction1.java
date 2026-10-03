package box6;

abstract class Gajni{ //Abstract class - A class which use abstract keyword for method or class
	
	abstract void fight();  //abstract method
	
}

class toxic{   //concrete class - A class without abstract keyword is called concrete class or a class which is not a abstract class is called concrete class.
	
	// abstract void kill(); //CTE
	//Abstract method are not allowed in concrete class
	void sing() {
		System.out.println("singing");
	}
	
}

public class Abstraction1 {
	public static void main(String[] args) {
		toxic t1 = new toxic();
		t1.sing();
		//  Gajni g1 = new Gajni(); //CTE	
		// We can not create object 0f a abstract class
	}

}
