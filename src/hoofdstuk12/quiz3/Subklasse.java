package hoofdstuk12.quiz3;

public class Subklasse extends Superklasse {
	int x = 3;
	String methodeA(String s, int i) {
		String str = s + ", " + i;
		//Opdracht: Welke foutmelding komt er met dit: super.x ++;
		//The final field Superklasse.x cannot be assigned.
		return str;
	}
	public static void main(String[] args) {
		Subklasse sk = new Subklasse();
		System.out.print(sk.methodeA(23, "Emma"));
	}
}
