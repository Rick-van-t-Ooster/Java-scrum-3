package hoofdstuk13.EigenOpdracht;

import java.util.Scanner;

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

//Rick zijn methode.
	
	public void customEten() {
		System.out.println("Hij gaat opnieuw eten maar hij weet niet hoeveel hij wilt eten. Kies hoeveel hij nu gaat eten.");
		Scanner input = new Scanner(System.in);
		try {
		int aantal = input.nextInt();
			if(aantal<=0) {
				System.out.println("Ongeldige invoer");
			}else {

				double tempGewichtOpslag = aantal*0.5;
				System.out.println("Na het opnieuw eten komt er " + tempGewichtOpslag + " Kilo bij");
				System.out.println("Hierdoor weegt hij nu ongeveer: " + addDikteKilo((int) tempGewichtOpslag));
			}
		}catch(Exception e) {
			System.out.println("Ongeldige invoer....");
			input.nextLine();
			customEten();
		}
		input.close();//sluiten scanner i.v.m. resource leaks
		
		
	}
}
