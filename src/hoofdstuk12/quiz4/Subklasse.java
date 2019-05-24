package hoofdstuk12.quiz4;
//Gemaakt door Jelle
public class Subklasse extends Superklasse{
	void methodeA(int x, int y) {
		int z = x - y;
		System.out.print(z);
	}
	public static void main(String[] args) {
		Subklasse sk = new Subklasse();
		//Opdracht wat gebeurt er als je (5, 3.0) veranderd naar 6 en 4?
		//Dan neemt ie de methode van de subklasse niet de superklasse 
		//omdat het allebij ints zijn niet doubles..
		sk.methodeA(6, 4);
	}
}
