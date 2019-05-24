package hoofdstuk11.eigenOpdracht;

import java.util.Scanner;

public class Subklasse extends Superklasse {
	protected static int aantalLiterBenzine = 30;
	Subklasse(int aantalLiterBenzine){
		super(30);
	}
	
	//Deze methode door Jelle
	public static void rijden() {
		System.out.println("Deze auto rijdt 30 kilometer op 1 liter benzine, hij heeft 30 liter benzine.");
		System.out.println("Hoeveel kilometer wilt u rijden?");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if (input > 900) {
			System.out.println("Zo ver kan de auto niet rijden!");
		}else {
			int kmEraf = input / 30;
			aantalLiterBenzine = aantalLiterBenzine - kmEraf;
			System.out.println("U heeft " + input + " kilometer gereden, daarom is er nu " + aantalLiterBenzine + " liter over.");
		}
	}
	
	public static void main(String[] args) {
		rijden();
	}
}
