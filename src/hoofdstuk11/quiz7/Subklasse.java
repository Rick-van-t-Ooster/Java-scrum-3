package hoofdstuk11.quiz7;
//Gemaakt door jelle
public class Subklasse extends Superklasse{
	Subklasse(String naam) {
		//Vraag 1 en 2, wat gebeurd er als je super(naam) veranderd met super("s")?
		super("s");
		System.out.println(naam);
	}
	public static void main(String[] args) {
		Subklasse sk = new Subklasse("x");
	}
}
