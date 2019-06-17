package hoofdstuk13.EigenOpdracht;

public class AbstrKlasse {
	public int dikteKilo = 100;
	
	public int getDikteKilo() {
		return dikteKilo;
	}

	public int addDikteKilo(int kilo) {
		dikteKilo = dikteKilo + kilo;
		return dikteKilo;
	}
	
	public int removeDikteKilo(int kilo) {
		dikteKilo = dikteKilo - kilo;
		return dikteKilo;
	}
}
