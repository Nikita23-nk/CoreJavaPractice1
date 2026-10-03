package day7;

public class Main {
	public static void main(String[] args) {
//		Box box1 = new Box(4.4,9.9,7.9);
//		Box box2 = new Box(box1);
//		System.out.println(box1.l+"  "+box1.w+"  "+box1.h);
		
		BoxWeight box3 = new BoxWeight();
		BoxWeight box4 = new BoxWeight(3.5,4.6,5.3,6.7);
		System.out.println(box3.h+"  "+box3.weight);
	}

}
