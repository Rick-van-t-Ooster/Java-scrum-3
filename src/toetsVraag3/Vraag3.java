package toetsVraag3;

public class Vraag3 {
	
	
	
	public static void main(String[] args) {
		SuperKlasse sk = new SuperKlasse();
		sk.increment(5);
		System.out.println(sk.krijgX());
		SubKlasse s = new SubKlasse();
		s.increment(5);
		System.out.println(s.krijgX());
		
	}
	
	
	
	
}
