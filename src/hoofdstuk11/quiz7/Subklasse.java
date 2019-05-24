package hoofdstuk11.quiz7;

public class Subklasse extends Superklasse{
<<<<<<< HEAD
	Subklasse(String naam) {
		//Vraag 1 en 2, wat gebeurd er als je super(naam) veranderd met super("s")?
		super("s");
		System.out.println(naam);
	}
	public static void main(String[] args) {
		Subklasse sk = new Subklasse("x");
	}
=======

	Subklasse(String naam) {
		super(naam);
		System.out.print(naam);
	}
	
	public static void main(String[] args) {
		Subklasse sk = new Subklasse("x");
	}

>>>>>>> feb165eee9818a56c765fec91dbe2ef229079179
}
