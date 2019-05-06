package hoofdstuk11.quiz2;

public class Subklasse extends Superklasse{

	public Subklasse(int y) {
			x += y;
	}
	
	public static void main(String[] args) {
		
		Subklasse sk = new Subklasse(4);
		System.out.print(sk.x);
		
		Subklasse sk2 = new Subklasse(6);
		//output is 9 omdat x geen statisch lid is.
		System.out.println(sk2.x); 
		
	}
}
