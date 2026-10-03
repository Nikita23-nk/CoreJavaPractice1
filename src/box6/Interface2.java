package box6;

interface Tarzen {   //Interface
	
	public static final int n = 80;
	                    int m = 90;
	                    
    public abstract void race();
                    void jump();
    // automatically methods are public and abstract                
}

class Raj implements Tarzen{
	@Override 
	public void race() {
		System.out.println("racing");
	}
	
	@Override 
	public void jump() {
		System.out.println("jumping");
	}
}

class Everest {  //concrete class
	
	int  x  = 55;
	
	void fight () {
		System.out.println("fighting");
	}
	
}

public class Interface2 {
	public static void main(String[] args) {
		System.out.println("main start ");
		
		System.out.println(Tarzen.n);  //80
		System.out.println(Tarzen.m);  //90
		System.out.println(new Everest().x);  //55 //it's non static
		
		System.out.println("main End  ");
	}

}
