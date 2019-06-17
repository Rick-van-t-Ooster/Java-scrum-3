package hoofdstuk14.quiz3;

public class MijnKlasse extends Superklasse{

//	int x = 6; antwoord extra vraag 2: de 6 word vervangen door een 4 omdat de 4 uit de interface word overgenomen.
	
	public void mijnMethode(String s) {
		mijnMethode();
		System.out.print("q" + s + x);
	}
	
	public static void main(String[] args) {
		MijnKlasse mk = new MijnKlasse();
		
		mk.mijnMethode("W");
	}
	
}
