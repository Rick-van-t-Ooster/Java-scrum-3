package hoofdstuk14.boekOpdracht;

public class Test {

	public static void main(String[] args) {
		Werknemer werknemer = new Werknemer(3000.00);
		Freelancer freelancer = new Freelancer(140, 60.00);
		
		
		werknemer.loonBerekenen();
		
		freelancer.loonBerekenen();
	}
	
}
