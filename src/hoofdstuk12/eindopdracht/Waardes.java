package hoofdstuk12.eindopdracht;

import java.math.BigDecimal;

public final class Waardes {

	//attributes
	public static final double PI = 3.142857142857143; 
	
	//methods
	public static BigDecimal berekenOmtrek(double diameterFromUser) {
		
			
			System.out.println(diameterFromUser);
			BigDecimal diameter = BigDecimal.valueOf(diameterFromUser);
			BigDecimal BigPI = BigDecimal.valueOf(Waardes.PI);
			BigDecimal output = diameter.multiply(BigPI);
			System.out.println(output);
			return output;

		}
	
}
