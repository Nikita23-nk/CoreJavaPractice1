package box1;

public class Ternaryopt2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 25 ;
		int c = 5;
		int d = 18;
		int max = (a>b)?
				((a>c) ?
						((a>d)? a:d):
							((c>d)? c:d))
				:((b>c)?((b>d)? b:d):
					((c>d)?c:d));
					System.out.println(max);
				
				
	}

}
