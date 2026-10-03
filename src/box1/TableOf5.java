package box1;

public class TableOf5 {
	public static void main(String[] args) {
		int ans = 5;
		int table = 0;
		for(int i=1;i<=10;i++) {
			table = ans * i;
		//	System.out.println(table);
			System.out.println(ans +" * "+ i + " = " + table );
		}
		
	}
}
