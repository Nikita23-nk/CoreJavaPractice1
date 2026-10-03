package box2;

public class Marksprogram {
	public static void main(String[] args) {
		int marks = 80;
		//Nikita kedar  
				if(marks >80 && marks <=100)
		{
			System.out.println("Student is Excellent");
		}
				else if(marks >60 && marks <=80){
			System.out.println("Student is Good");
		}
				else if(marks >=35 && marks <=60){
			System.out.println("Student is Average");
		}
				else if(marks >=0 && marks <35) {
			System.out.println("Student is Fail");
		}else {
			System.out.println("Invalid marks");
		}
	}

}
