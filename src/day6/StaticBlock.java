package day6;

// this is a demo to show initialization of static variables
public class StaticBlock {
	static int a = 4;
	static int b;
	
	//will only run once, when the first obj is created i.e. when the class is loaded for the first time
	static {
		System.out.println("I am in Static block");
		b = a *4;
	}
	
	public static void main(String[] args) {
		StaticBlock obj = new StaticBlock();
		System.out.println(StaticBlock.a+" "+StaticBlock.b);
		
		StaticBlock.b += 3;
		
		StaticBlock obj2 = new StaticBlock();
		System.out.println(StaticBlock.a+" "+StaticBlock.b);
		
	}

}
