package day2;

public class GradeSystem {
	public static void main(String[] args) {
		double marks = 78;
		
		if(marks>90 && marks<=100) {
			System.out.println("Grade A");
		}else if(marks >= 75 && marks <= 90) {
		System.out.println("Grade B");
		}else if(marks > 60 && marks <= 74) {
			System.out.println("Grade C");
		}else if(marks < 60 && marks >= 0){
			System.out.println("Fail");
		}else {
			System.out.println("Invalid ");
		}
	}

}
