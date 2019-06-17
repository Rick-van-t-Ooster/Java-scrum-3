package hoofdstuk14.quiz1;

public class MijnKlasse implements MijnInterface{

	public void methode() {
		System.out.print(x);
//		x++; variabele in een interface zijn constants en kunnen niet worden aangepast
	}
	
	public void methode(int i) {
		int z = i;
		
		 z = z + x;
		
		methode();
		System.out.print(4);
		
	}

	
	public static void main(String[] args) {
		//extra vraag
		int x = 7;
		x++; 
		//deze statements veranderen de uitvoer van de code niet omdat er niks met de lokaal gedeclareerde x word gedaan.
		
		new MijnKlasse().methode(4);
	}
	
}
