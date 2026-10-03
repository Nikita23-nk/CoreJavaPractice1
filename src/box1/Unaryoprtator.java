package box1;

public class Unaryoprtator {
   public static void main(String[] args) {
	int a = (5-3);
	int b = a++ - --a + a-- ;
	int c = a++ + (b*=3);
	int d = (a + b +c )*2 + (20/5);
	int m = d++ - c++ + b-- + a++ ;
	int n = --m + c-- + m++ - b-- ;
	a++ ;
	--b;
	m--;
	n++;
	int r =(a + b + c +d + m + n) % 10;
	
	System.out.println(r);
   }
}
