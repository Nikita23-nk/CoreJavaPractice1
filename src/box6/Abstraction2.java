package box6;

abstract class Swarg{
	
	abstract void rambha();
	abstract void urvashi();
	abstract void meenka();
	
	void narad() {
		System.out.println("narayan narayan");
	}
}

abstract class Indra extends Swarg{
	
	@Override 
	void rambha() {
		System.out.println("Bhushan ke sath salsa ");
	}
	@Override 
	void urvashi() {
		System.out.println("Prashil ke sath garba ");
	}
}

class Sunil extends Indra{
	@Override 
	void meenka() {
		System.out.println("Study with Sunil ");
	}
}
public class Abstraction2 {
	public static void main(String[] args) {
		Swarg s1 = new Sunil();
		s1.meenka();
		s1.rambha();
		s1.urvashi();
		s1.narad();
		
	}
	

}
