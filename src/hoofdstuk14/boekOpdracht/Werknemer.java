package hoofdstuk14.boekOpdracht;

public class Werknemer implements Betaling{

	private double loon;
	
	public void setLoon(double loon) {
		this.loon = loon;
	}
	
	public double getLoon() {
		return this.loon;
	}
	
	public Werknemer(double loonPerMaand) {
		this.loon = loonPerMaand;
	}
	
	public void loonBerekenen() {
		System.out.println(getLoon()*0.7);
	}
	
}
