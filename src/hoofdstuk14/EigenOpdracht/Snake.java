package hoofdstuk14.EigenOpdracht;

public class Snake implements Shape {
	//Jelles Class
	private int height;
	private char icon;
	private String kleur;
	private String bg;
	
	public Snake(int h, char icon, String kleur, String bg) {
		this.height = h;
		this.icon = icon;
		this.kleur = kleur;
		this.bg = bg;
	}
	
	@Override
	public void draw() {
		for (int i = 0; i < height; i++) {
			if(bg == null) {
				System.out.print(kleur + icon + AnsiKleuren.ANSI_RESET);
			}else {
				System.out.print(bg + kleur + icon + AnsiKleuren.ANSI_RESET);
			}
			System.out.println("");
		}
	}
	
	@Override
	public void setSymbol(char c) {
		icon = c;
		
	}
	
	@Override
	public double area() {
		
		return height;
	}

}
