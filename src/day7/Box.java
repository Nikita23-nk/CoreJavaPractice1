package day7;

public class Box {
	double l;
	double h;
	double w;
	
	Box(){
		double l=-1;
		double h=-1;
		double w=-1;
	}
	Box(double side){
		this.w=side;
		this.l=side;
		this.h=side;
	}
	Box(double l,double h,double w){
		this.h=h;
		this.l=l;
		this.w=w;
	}
	Box(Box old){
		this.l=old.l;
		this.h=old.h;
		this.w=old.w;
	}
	
	public void information() {
		System.out.println("Running InheritanceInJava");
	}
}
