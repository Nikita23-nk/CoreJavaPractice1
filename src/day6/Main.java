package day6;

public class Main {
	public static void main(String[] args) {
		StaticcHuman niki = new StaticcHuman(22,"Nikita kedar",1000000000,false);
		StaticcHuman vipin = new StaticcHuman(21,"Vipin Patil",100000000,false);
		
		System.out.println(niki.name);
		System.out.println(vipin.name);
		System.out.println(niki.population);
		System.out.println(vipin.population);
		Main obj = new Main();
		obj.greetings();
		
//		obj.fun2();
	}
	
	// this is Static , this is not dependent on objects
	static void fun() {
//		greeting();     // you can't use this because it requires an instance
		// but ths function you are using it is depend on instance
		System.out.println("baby shatututdutudu");
		
	}
    void fun2() {
    	greetings();
    }
	
	void greetings() {
		fun();  
		// we know that something which is not static ,belongs to an object
		System.out.println("Hello World");
		
	}
	}
