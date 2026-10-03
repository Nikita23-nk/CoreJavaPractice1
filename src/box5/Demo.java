package box5;

public class Demo {
	public static void main(String[] args) {
	Employees e1 = new Employees("Nikita",23,999999999.999);
	System.out.println(e1.name+" "+e1.age+" "+e1.salary);
	}
}

class Employees{
	String name;
	int age;
	double salary;
	
	Employees(String name,int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
}
