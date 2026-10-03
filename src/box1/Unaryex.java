package box1;

public class Unaryex {
	public static void main(String[] args) {
		int i = -3 ;
		int j = -5 ;
		int k = --i - j -- ;
		int m = (i-j) ;
		int p = i-- + k-- - --j ;
		int q= (p-=30) + (m*=2) + (i/=2);
		int r =(i+j+k) +30 ;
		int t = r++ - m++ + (i+j +q+p);
		 System.out.println(i+" " +j+" " +k+" "+m +" " +p);
		 System.out.println(q+" " +r +" " +t);
	}

}
