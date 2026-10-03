package selfStudy;

public class StudentGrades {
	public static void main(String[] args) {
		char grade = 'A';
		if(grade == 'A' || grade =='a'){
				System.out.println("Excellent");
	}else if(grade =='B' || grade == 'b') {
		System.out.println("Good");
	}else if(grade =='c'||grade =='C') {
		System.out.println("Average");
	}else if(grade =='F' || grade == 'f') {
		System.out.println("fail");
	}else {
		System.out.println("Invalid grade");
	}
	}
}
