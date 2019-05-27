package hoofdstuk12.eindopdracht;

import java.math.BigDecimal; //BigDecimal is een non primitive type voor meerdere getallen.

public final class Waardes {

	//(Wiskundige) Waardes Rick
	public static final double PI = 3.142857142857143; 
	
	//methods Rick
	public static BigDecimal berekenOmtrek(double diameterFromUser) {
		
			
			
			BigDecimal diameter = BigDecimal.valueOf(diameterFromUser);
			BigDecimal BigPI = BigDecimal.valueOf(Waardes.PI);
			BigDecimal output = diameter.multiply(BigPI);
			
			return output;

		}

	public static BigDecimal berekenOppervlak(double diameter) {
		BigDecimal dia = BigDecimal.valueOf(diameter);
		BigDecimal BigPI = BigDecimal.valueOf(Waardes.PI);
		BigDecimal straal = dia.divide(BigDecimal.valueOf(2));
		BigDecimal surface = straal.pow(2).multiply(BigPI);
		
		return surface;
	}
	
}
