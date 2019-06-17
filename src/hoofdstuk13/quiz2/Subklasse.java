package hoofdstuk13.quiz2;

public class Subklasse extends Superklasse{
	Subklasse(){
		//Door dit stukje code wordt er nips geschreven in plaats van nps
		super(10);
		System.out.print("p");
	}
	public static void main(String[] args) {
		new Subklasse().printLetter('s');
	}
}
