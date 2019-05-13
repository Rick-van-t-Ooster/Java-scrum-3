package hoofdstuk11.quiz7;

public class Subklasse extends Superklasse{

	Subklasse(String naam) {
		super(naam);
		System.out.print(naam);
	}
	
	public static void main(String[] args) {
		Subklasse sk = new Subklasse("x");
	}

}
