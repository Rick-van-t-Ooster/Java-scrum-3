package hoofdstuk13.quiz5;

public class MijnKlasse extends MijnAbstract{
	void methodeA() {
		System.out.print("x");
	}
	void methodeA(int x) {
		System.out.print("y" + x);
	}
	String methodeB(String s) {
		return s + x;
	}
	String methodeB(int x){
		return "x" + x;
	}
	
	public static void main(String[] args) {
		MijnKlasse mk = new MijnKlasse();
		mk.methodeA();
		System.out.print(mk.methodeB("y"));
		System.out.println();
		
		//Op deze manier kan je de abstracte methode vindPrijs toch nog aanroepen ook al staat ie in een andere klasse.
		System.out.print(mk.vindPrijs(5));
		
	}
}
