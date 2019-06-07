package hoofdstuk13.quiz4;

public class MijnKlasseA extends MijnKlasseB{
	MijnKlasseA(){
		System.out.print("b");
	}
	MijnKlasseA(int i){
		System.out.print("d" + i);
	}
	
	//Zorg ervoor dat de error weggaat dus dit toegevoegd
	int bereken(int x, int y) {
		return x * y;
	}
}
