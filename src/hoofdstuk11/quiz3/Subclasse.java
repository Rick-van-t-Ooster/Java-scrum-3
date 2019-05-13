package hoofdstuk11.quiz3;

public class Subclasse extends Superklasse {

	char c2 = 'A';
	
	Subclasse() {
		this('N');
		System.out.print(c2);
	}
	
	Subclasse(char c) {
		System.out.print(c);
	}
	
	void mijnMethode() {
		super.mijnMethode();
		System.out.print(c2);
	}
	
	public static void main(String[] args) {
		Subclasse subC = new Subclasse();
		subC.mijnMethode();
	}
}
