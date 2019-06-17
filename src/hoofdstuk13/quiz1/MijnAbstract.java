package hoofdstuk13.quiz1;

public abstract class MijnAbstract {
	protected int x = 6;
	
	public MijnAbstract() {
		x += 2;
	}
	abstract int bereken(int x);
	
	abstract String printNaam(String naam);
}
