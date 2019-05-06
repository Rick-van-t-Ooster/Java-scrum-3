package hoofdstuk11.quiz1;

public class Subklasse extends Superklasse{

	
	//originele waarde van y = 3.
	private int y = 8;
	
	public Subklasse() {
		x+=2;
		y++;
		
		System.out.print( x + ", " + y);
	}
	public static void main(String[] args) {
		Subklasse sk = new Subklasse();
		
	}
	
}
