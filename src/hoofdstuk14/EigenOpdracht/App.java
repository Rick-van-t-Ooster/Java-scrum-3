package hoofdstuk14.EigenOpdracht;

public class App {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(2, 4, '\\', AnsiKleuren.ANSI_YELLOW, AnsiKleuren.ANSI_WHITE_BACKGROUND);
		Triangle tri = new Triangle(5, '.', AnsiKleuren.ANSI_BLUE, AnsiKleuren.ANSI_BLUE_BACKGROUND);
		
		tri.draw();
		
		System.out.println("Oppervlak driehoek: " + tri.area());
		
		rec.draw();
	}
	
}
