package box2;

public class Gradeprogram {
	public static void main(String[] args) {
		char grade = 'F';
		//Nikita kedar  
				if(grade == 'A' || grade == 'a')
		{
			System.out.println("Student is Excellent");
		}
				else if(grade == 'B' || grade == 'b'){
			System.out.println("Student is Good");
		}
				else if(grade == 'C' || grade == 'c'){
			System.out.println("Student is Average");
		}
				else if(grade == 'F' || grade == 'f') {
			System.out.println("Student is Fail");
		}else {
			System.out.println("Invalid grade");
		}
	}

}
