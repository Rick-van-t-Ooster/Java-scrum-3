package hoofdstuk14.quiz2;

public class MijnKlasse implements InterfaceA, InterfaceB{

int MAX_TOEGESTAAN;
	
int z = 2;
	
public void mijnMethode() {
	int z = MAX_TOEGESTAAN+4;
	System.out.print("H");
}

public void mijnMethode(char j) {
MAX_TOEGESTAAN +=3;

	System.out.print(j);
	System.out.print(z);

}

public int som() {
	
	return MAX_TOEGESTAAN + z;
}

	
public static void main(String[] args) {
	MijnKlasse mk = new MijnKlasse();
	
//	mk.mijnMethode('k'); originele statement
	mk.mijnMethode(); //statement van de extra vraag;
}

}
