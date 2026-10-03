package selfstudyoops;

class Vinod{
	int v = 3;
	void Sapna() {
		System.out.println("Vinod loves Sapna");
	}

}
public class HumSathSathHai {
	int i = 100;
	void Family() {
		System.out.println("The family which eats together Stays together");
	}
	
	public static void main(String[] args) {
		System.out.println("Movie Starts");
		int m = 10;
		String s = "HUM SATH SATH HAI";
		System.out.println(s+" is a Family Movie. Rating for the movie is "+m);
		System.out.println(new Prem().p);
		new Prem().Preeti();
		System.out.println(new Vinod().v);
		new Vinod ().Sapna();
		System.out.println(new HumSathSathHai().i );
		new HumSathSathHai().Family();
		System.out.println("Movie Ends");
	}

}
