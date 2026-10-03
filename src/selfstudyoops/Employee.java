package selfstudyoops;

public class Employee {    //set 1 public class
	private int empid;     //set 3 private attribute
	private String name;
	private double sal;
	
	// set 3 public construct
	public Employee(int empid , String name,double sal) {
		this.empid = empid;
		this.name=name;
		this.sal=sal;
	}
	//set 4 public getter and setter method
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public double setsal() {
		return sal;
	}
	public void setsal(double sal) {
		this.sal=sal;
	}
	public int getempid() {
		return empid;
	}
	public double getsal() {
		return sal;
	}

}
