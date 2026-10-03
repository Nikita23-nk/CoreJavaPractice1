package box5;

public class Main {
	public static void main(String[] args) {
		stu s=new stu();
		
		stu s1=new stu("Nikki");
		stu s3=new stu(23);
		
		stu s2=new stu("Nikita",23,"MCA");
		
		stu s4=new stu(24,"Adii");
		System.out.println(s1.name);
		System.out.println(s2.name+" "+s2.age+" "+s2.course);
		System.out.println(s3.age);
		System.out.println(s4.name);
		System.out.println(s4.age);
		
	}

}

class stu{
	String name;
	int age;
	String course;
	
	stu(){
		System.out.println("Student class with no argumented constructor.");
	}
	
	stu(String n){
		name=n;
	}
	stu(int a){
		age=a;
	}
	
	stu(String n,int a,String c){
		name=n;
		age=a;
		course=c;
	}
	stu(int a,String n){
		age=a;
		name=n;
	}
}
