package box5;

public class StaticAndNonStatic {
	public static void main(String[] args) {
		Student1 s = new Student1();
		s.name="Nikki";
		s.age=23;
		s.course="MCA";
		
		System.out.println(s.name+" "+s.age +" "+ s.course);
		
		Student1 s2 = new Student1();
		s2.name="Adii";
		s2.age=20;
		s2.course="B.tech";
		
		System.out.println(s2.name+" "+s2.age +" "+ s2.course);
	}
}
