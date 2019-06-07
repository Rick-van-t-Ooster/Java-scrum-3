package hoofdstuk13.quiz1;

public class MijnKlasse extends MijnAbstract {
	int bereken() {
		return x + 5;
	}
	int bereken(int x) {
		return super.x + x;
	}
	
	String printNaam(String naam){
		return naam;
	}
	
	public static void main(String[] args) {
		MijnKlasse mk = new MijnKlasse();
		System.out.println(mk.bereken(4));
		System.out.println(mk.printNaam("Just in kees"));
	}
}
