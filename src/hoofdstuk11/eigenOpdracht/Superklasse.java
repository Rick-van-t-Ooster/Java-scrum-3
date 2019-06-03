package hoofdstuk11.eigenOpdracht;

public class Superklasse {
	protected int aantalLiterBenzine = 30;
	//method maarten
	protected char liter = 'L';
	Superklasse(int aantalLiterBenzine) {
	}
	//method maarten
	void mijnMethode(){
		aantalLiterBenzine += 4;
		System.out.print(liter);
		System.out.print(aantalLiterBenzine);
	}
}
