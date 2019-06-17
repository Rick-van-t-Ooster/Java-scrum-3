package hoofdstuk13.quiz4;

public class MijnKlasse extends MijnKlasseA{

	MijnKlasse(int i){
		System.out.print("c" + i);
	}
	
	public static void main(String[] args) {
		new MijnKlasse(4);
		new MijnKlasseA(4);
	}
}
