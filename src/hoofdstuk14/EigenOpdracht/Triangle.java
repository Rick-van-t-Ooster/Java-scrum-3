package hoofdstuk14.EigenOpdracht;

public class Triangle implements Shape{

	private int height;
	private char icon;
	private String kleur;
	private String bg;
	public Triangle(int h, char icon, String kleur, String bg) {
		this.height = h;
		this.icon = icon;
		this.kleur = kleur;
		this.bg = bg;
	}
	
	@Override
	public void setSymbol(char c) {
		this.icon = c;
		
	}
	
	@Override
	public void draw() {
		for (int i = 0; i < height; i++) {
			for(int x = 0; x < i; x++) {
				if(bg == null) {
					System.out.print(kleur +icon + AnsiKleuren.ANSI_RESET);
				}else {
					System.out.print(bg+  kleur +icon + AnsiKleuren.ANSI_RESET);
				}
				
			}
			System.out.println("");
		}
		
	}

	@Override
	public double area() {
		double temp = (double) height * height;
		System.out.println(temp);
		double area = temp/2;
		
		return area;
	}

}
