package box6;

class Mumbai{
	int a = 678;
	void City() {
		System.out.println("City of Dreams...");
	}
}

class Maharashtra{
	static Mumbai m1 = new Mumbai();
	int b = 234;
	void Chhtrapati() {
		System.out.println("Swarrajy hwave hii  shreenchi ichha .....");
	}
}

class India{
	static Maharashtra mh1 = new Maharashtra ();
	int c = 345;
	void History() {
		System.out.println("History Rich country...");
	}
	
	}


class Asia{
	static India i1 = new India();
	int d = 890;
	void country() {
		System.out.println("India belongs to Asia...");
	}
}

class Earth{
	static Asia a1 = new Asia();
	int e = 890;
	void Planet() {
		System.out.println("Asia belongs to earth ...");
	}
}

class SolarSystem{
	static Earth e1 = new Earth();
	int f = 345;
	void Sun() {
		System.out.println("In solar system every planet revolves around the Sun");
	}
}


public class HasARelationshipcode2 {
	public static void main(String[] args) {
		System.out.println("main start");
		
		SolarSystem s1 = new SolarSystem();
		System.out.println(s1.f);
		System.out.println(s1.e1.a1.i1.mh1.m1.a);
		s1.Sun();
		SolarSystem.e1.a1.country();
		s1.e1.a1.country();
		s1.e1.Planet();
		System.out.println(s1.e1.a1.i1.c);
		s1.e1.a1.i1.mh1.m1.City();
		
		
		
		
		
		
	}

}
