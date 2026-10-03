package box6;

class Battery{
	int x = 123;
	void capacity(){
		System.out.println("500 MH capacity");
	}
}

class Mobile{
	static Battery b1 = new Battery();
	int y = 345;
	void games() {
		System.out.println("Playing PUBG");
	}
	
}
public class HasARelationshipcode1 {
	public static void main(String[] args) {
		System.out.println("main start ");
		
		Mobile m1 = new Mobile();
		System.out.println(m1.y);
		System.out.println(m1.b1.x);
		m1.games();
		System.out.println(Mobile.b1.x);
		System.out.println();
	}
	

}
