package hoofdstuk12.quiz1;

public final class MijnKlasse extends SuperKlasse {

	//conclusie vraag 1: MijnKlasse kan een Super klasse hebben.
	
	final int x = 3;
	
	int bereken(int y, int z) {
		
		if (x >= z) {
			return y + x;
			
		}else {
			
	//Wanneer de code op lijn 20 word ge uncomment dan kan de code niet gecompiled worden omdat x een constant is en niet kan worden aangepast.
			
			//y = 5;
			//z += 3;
			//z = x / 2;
			//int x = 6;
			//x ++;
			
			
			
			return z + x;
		}
	}
	public static void main(String[] args) {
		MijnKlasse mk = new MijnKlasse();
		System.out.println(mk.bereken(4, 6));
	}
	
}
