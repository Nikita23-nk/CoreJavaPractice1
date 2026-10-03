package selfstudyoops;

class Modak {
	Modak(){
		System.out.println("Ukadicha Modak (No parameter constructor)");
	}
	Modak(int a){
		System.out.println("Choco Modak ( int - parameter Constructor)");
	}
	Modak(double b){
		System.out.println("Gulacha Modak ( double -parameter constructor)");
	}
	Modak(int i , double j){
		System.out.println("sakharecha Modak ( int,double -parameter constructor)");
	}
	Modak(double c,int d){
		System.out.println("gavacha Modak ( double,int -parameter constructor)");
	}
}
public class Festival {
	public static void main(String[] args) {
		Modak m1 = new Modak();
		Modak m2 = new Modak(12);
		Modak m3 = new Modak(23.3);
		Modak m4 = new Modak(1,23.3);
		
		
	}

}
