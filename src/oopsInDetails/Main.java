package oopsInDetails;

public class Main {
	public static void main(String[] args) {
	Student s1 = new Student();
	s1.name="Nikita";
	s1.age=23;
	s1.course="MCA";
	
	System.out.println(s1.name+" "+s1.age+" "+s1.course);
	
	Student s2 = new Student();
	s2.name="Adii";
	s2.age=20;
	s2.course="B tech";
	
	System.out.println(s2.name+" "+s2.age+" "+s2.course);
	
}
}

class Student{
	String name;
	int age;
	String course;
	
}