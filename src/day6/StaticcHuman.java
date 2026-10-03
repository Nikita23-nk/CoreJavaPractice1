package day6;

public class StaticcHuman {
	int age ;
	String name;
	int Salary;
	boolean married;
	static long population;
	
	public StaticcHuman(int age , String name,int Salary, boolean married) {
		this.age=age;
		this.name=name;
		this.Salary=Salary;
		this.married=married;
		StaticcHuman.population += 1;
	
	}
}
