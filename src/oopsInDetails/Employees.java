package oopsInDetails;

public class Employees {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.id=101;
		e1.name="Pattu";
		e1.department="IT";
		e1.salary=29000;
		System.out.println(e1.id+" "+e1.name+" "+e1.department+" "+e1.salary);
		
		Employee e2 = new Employee();
		e2.id=101;
		e2.name="Pattu";
		e2.department="IT";
		e2.salary=29000;
		System.out.println(e2.id+" "+e2.name+" "+e2.department+" "+e2.salary);
		
		Employee e3 = new Employee();
		e3.id=101;
		e3.name="Pattu";
		e3.department="IT";
		e3.salary=29000;
		System.out.println(e3.id+" "+e3.name+" "+e3.department+" "+e3.salary);
		
		e2.salary=27000;
		System.out.println(e2.id+" "+e2.name+" "+e2.department+" "+e2.salary);
	}
}

 class Employee{
	 int id;
	 String name;
	 String department;
	 double salary;
 }