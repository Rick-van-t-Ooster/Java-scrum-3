package hoofdstuk13.quiz3;

public class MijnKlasse extends MijnAbstract {
	MijnKlasse(){
		this(2);
		str += 7;
	}
	MijnKlasse(int x){
		str += x;
	}
	
	public static void main(String[] args) {
		MijnKlasse mk = new MijnKlasse();
		System.out.print(mk.str);
	}
}
