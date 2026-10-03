package selfstudyoops;

class Robot{
	String name ;
	double mem;
	int speed;
	
	Robot(String m,double n ,int o){
		System.out.println("Constructor Start");
		name = m;
		mem = n;
		speed = o;
		System.out.println("Constructor End");
	}
	
	void info() {
		System.out.println("Robot name is "+name+" Ronot mem is "+mem+" GB "+" Robot speed is "+speed);
	}
}
public class Lab {
	public static void main(String[] args) {
		System.out.println("Main Start");
		System.out.println("............");
		Robot r1 = new Robot("Chitti",128,220);
		r1.info();
		System.out.println("............");
		Robot r2 = new Robot("RaOne ",256,500);
		r2.info();
		System.out.println(".............");
		System.out.println("Main End");
	}
	

}
