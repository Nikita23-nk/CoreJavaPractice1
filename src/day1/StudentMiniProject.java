package day1;

public class StudentMiniProject {
	public static void main(String[] args) {
		String sname = "Nikita";
		double english = 66;
		double maths = 88;
		double science = 98;
		double total =  english + maths + science ;
		double per = total/3;
		
		System.out.println(sname+" - name of student ");
		System.out.println(total +" - Total of 3 subjects");
		System.out.println(per+" = Percentage of subjects");
		
	}

}
