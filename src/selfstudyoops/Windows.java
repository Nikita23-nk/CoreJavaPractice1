package selfstudyoops;

class Microsoft{
	String ver;
	int speed;
	double size;
	
	public Microsoft(String ver,int speed,double size) {
		System.out.println("this keyword contains "+this);
		this.ver = ver;
		this.speed = speed;
		this.size = size;
	}
	void mahiti() {
		System.out.println("Software version is "+ver+" Speed is "+speed+" size is "+size);
	}
}

public class Windows {
	public static void main(String[] args) {
		System.out.println("Main Started");
		Microsoft m1 = new Microsoft("M12",222,128);
		System.out.println("M1 Contains "+m1);
		m1.mahiti();
		System.out.println("............");
		Microsoft m2 = new Microsoft("M22",333,256);
		System.out.println("M2 Contains "+m2);
		m2.mahiti();
		System.out.println("............");
		System.out.println("Main Ended");
	}

}
