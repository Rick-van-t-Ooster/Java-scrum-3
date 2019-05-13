package hoofdstuk11.quiz6;

public class Subklasse extends Superklasse {
	
	void mijnMethode() {
		x++;
		System.out.print(e);
		super.mijnMethode();
		x += 2;
		System.out.print(x);
	}
	
	public static void main(String[] args) {
		Subklasse sk = new Subklasse();
		sk.mijnMethode();
	}
}
