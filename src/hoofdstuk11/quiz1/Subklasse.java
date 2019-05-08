package hoofdstuk11.quiz1;

public class Subklasse extends Superklasse{

	
		//Goed bezig !! Ga zo door
		//JGP Roode 8-5-2019
	
	//originele waarde van y = 3.
	private int y = 8;
	
	//no argument constructor van de class Subklasse
	public Subklasse() {
		x+=2;
		y++;
		
		System.out.print( x + ", " + y);
	}
	
	//main method
	public static void main(String[] args) {
		Subklasse sk = new Subklasse();
		
	}
	
}
