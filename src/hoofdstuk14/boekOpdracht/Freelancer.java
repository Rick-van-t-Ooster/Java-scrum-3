package hoofdstuk14.boekOpdracht;

public class Freelancer implements Betaling{

	private int uur;
	private double tarief;
	
	public void setUur(int uur) {
		this.uur = uur;
	}
	
	public void setTarief(double tarief) {
		this.tarief = tarief;
	}
	
	public int getUur() {
		return this.uur;
	}
	public double getTarief() {
		return this.tarief;
	}
	
	public Freelancer(int uur, double tarief) {
		this.uur = uur;
		this.tarief = tarief;
	}
	
	
	public void loonBerekenen() {
		double tempBrutoLoon = getTarief()*getUur();
		System.out.println(tempBrutoLoon*0.7);
		
	}
	
}
